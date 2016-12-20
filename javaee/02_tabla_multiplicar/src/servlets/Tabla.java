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
			out.println("<table border='1'>");
			out.println("<th colspan='11' style='background-color: yellow;font-size:35px'>Tablas de multiplicar</th>");
			for(int i=1;i<=10;i++){
				out.println("<tr>");
				out.println("<td style='background-color: yellow;font-size:25px;font-weight:bold' >Tabla del "+i+"</td>");
				for (int j=1;j<=10;j++){
					out.println("<td style='background-color: green; font-size:20px;font-weight:bold'> "+i+" x "+j+" = "+i*j+" </td>");	
				}		
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("<h1>Bienvenido a �ngel</h1>");
			out.println("</body>");
			out.println("</html>");
		}
		
	}

}
