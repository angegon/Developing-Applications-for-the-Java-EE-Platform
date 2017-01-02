package servlets;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Entrada")
public class Entrada extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		
		//ServletContext sc = this.getServletContext();//Esto daría null, porque todavia no esta el objeto disponible
		ServletContext sc = config.getServletContext();//Esto no
		
		//inicializamos el atributo global.
		sc.setAttribute("contadorGlobal", 0);
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Obtenemos el HttpSession que es una interface
		HttpSession hs = request.getSession();
		
		//Obtenemos un ServletContext
		ServletContext sc = this.getServletContext();
		
		//la primera vez se crea, y valdría nulo. daría una excepción.
		//si le metieramos directamente el hs.getAttribute a contador
		int contador=0;
		
		//para evitar esa excepción anterior, solo recuperamos el
		//atributo sino es la primera llamada al servlet.
		if(hs.getAttribute("contadorValor")!=null){
		    //a partir de la segunda vez, coje el anterior ya creado,
			//no crea uno nuevo..
			contador = (Integer) hs.getAttribute("contadorValor");
		}
		
		contador++;
		//en la primera llamada se crearia
	    hs.setAttribute("contadorValor", contador);
				
	    //Para el atributo de aplicación...Los atr
		int global;
		
		
		//Esto no es thread segure, para ello usaremos bloques sincronizados
		//Para que un hilo complete la tarea, antes de que lo coja otro(hilo correspondería a usuario)
		synchronized(sc){
			global = (Integer) sc.getAttribute("contadorglobal");
			
			global++;		
			
			sc.setAttribute("contadorGlobal", global);	
		}
				
		
		crearCookie(response);
		
		//Transferencia de la petición a la página inicio.html
		//puede ser de servlet a servlet, o de un servlet a un html
		request.getRequestDispatcher("inicio.html").forward(request, response);
		//la página html, no usará el request ni el response para nada.
		//pero la forma de hacer la transferencia de petición es esa.
		
	}
	
	private void crearCookie(HttpServletResponse response){
		
		Cookie ck = new Cookie("visita", LocalDateTime.now().toString());
		ck.setMaxAge(200000);
		response.addCookie(ck);
	}
}
