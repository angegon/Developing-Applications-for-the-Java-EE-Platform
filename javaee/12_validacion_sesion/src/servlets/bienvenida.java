package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/bienvenida")
public class bienvenida extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		
		try ( PrintWriter out = response.getWriter();){		
			out.println("<html>");
			out.println("<body>");
			out.println("</br><a href='Final?atributo=deportes'>Deportes</a>");
			out.println("</br><a href='Final?atributo=cine'>Cine</a>");
			out.println("</br><a href='Final?atributo=musica'>Musica</a>");
			out.println("</br><a href='login.html'>volver</a>");			
			out.println("</body>");
			out.println("</html>");
			out.close();
		}		
	}

}
