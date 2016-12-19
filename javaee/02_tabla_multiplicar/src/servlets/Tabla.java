package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Tabla")
public class Tabla extends HttpServlet {


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		response.setContentType("text/html");
		try ( PrintWriter out = response.getWriter();){		//Entre los m�todos del response, parametro.
			out.println("<html>");
			out.println("<body>");
			out.println("<table>");
			
			for(int i=1;i<=10;i++){
				
				for (int j=1;j<=10;j++){
					out.println("<tr><td>"+i+"x"+j+"</td><td>= "+i*j+"</td></tr>");	
				}				
			}
			out.println("</table>");
			out.println("<h1>Bienvenido a �ngel</h1>");
			out.println("</body>");
			out.println("</html>");
		}
		
	}

}
