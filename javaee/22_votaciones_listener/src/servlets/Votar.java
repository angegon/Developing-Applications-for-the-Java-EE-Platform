package servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Votar")
public class Votar extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		super.init(config);
		
		//Ponemos lo siquiente en el Listener
		/*//ServletContext sc = this.getServletContext();//Esto daría null, porque todavia no esta el objeto disponible
		ServletContext sc = config.getServletContext();//Esto no
		
		int si=0;
		int no=0;
		//inicializamos el atributo global.
		sc.setAttribute("contadorVotosSi", si);	
		sc.setAttribute("contadorVotosNo", no);*/	
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletContext sc = this.getServletContext();
		
		int si;
		int no;
		int recuperarvoto = Integer.parseInt(request.getParameter("votacion"));

		
		
		//Esto no es thread segure, para ello usaremos bloques sincronizados
		//Para que un hilo complete la tarea, antes de que lo coja otro(hilo correspondería a usuario)
		synchronized(sc){
			si = (int)sc.getAttribute("contadorVotosSi");
			no = (int)sc.getAttribute("contadorVotosNo");
			
			if(recuperarvoto==0) si++;
			else if (recuperarvoto==1)no++;
			
			sc.setAttribute("contadorVotosSi", si);
			sc.setAttribute("contadorVotosNo", no);
		}		
		
		request.getRequestDispatcher("votacion.html").forward(request, response);
	}

}
