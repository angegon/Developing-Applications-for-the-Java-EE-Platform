package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Saludo") //anotaci�n que indica al servidor de aplicaciones que es un servlet, y el context root(direcci�n que se le ha asignado -
//se le puede cambiar ahi)

public class Saludo extends HttpServlet {
    static int c;

    //El Service recibe dos objetos como parametros, que se los pasa el servidor de aplicaciones. 
    //HttpServletRequest y HttpServletresponse, que son interfaces, polimorfismo
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		c++; //la variable ser autilizada por todas las llamadas a la url. Es decir todos los clientes, 
		
		//Tipo Mime, cabecera indentificativa de lo que va a llegar en el cuerpo, se puede enviar cualquier formato.
		//Sino se pone, por defecto, el deduce que ser� html
		response.setContentType("text/html");
		
		//ctrl+mayus+o para importar.
		
		//Operaciones de entrada salida, 
		//Le ponemos un try con recursos para que cierre al final.
		
		//PrintWriter est� asociado al cuerpo de las respuesta.
		try ( PrintWriter out = response.getWriter();){		//Entre los m�todos del response, parametro.
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>Bienvenido a �ngel</h1>"+c);
			out.println("</body>");
			out.println("</html>");
		}
			
		
	}

}
