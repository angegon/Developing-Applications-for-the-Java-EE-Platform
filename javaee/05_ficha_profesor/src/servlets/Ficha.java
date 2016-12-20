package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ficha")
public class Ficha extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String nombre = request.getParameter("nombre");
		int edad = Integer.parseInt(request.getParameter("edad"));
		String codigo = request.getParameter("codigo");
		String fecha = request.getParameter("fecha");
		String zona = request.getParameter("zona");
		
		String tema [] = request.getParameterValues("tema");
		String sexo  = request.getParameter("sexo");
		String temas;

		try (PrintWriter out = response.getWriter();) { // Entre los métodos del
			// response, parametro.
			out.println("<html>");
			out.println("<body>");
			
			temas="no hay temas";
			if (tema!=null){
				out.println("Nombre: "+nombre+"</br>Edad: "+edad+"</br> Fecha: "+fecha+"</br> Zona: "+zona+"</br>Sexo: "+sexo);
				for(int i=0; i<tema.length;i++){
					out.println("</br>Zona: "+ i+" - "+tema[i]);
				}
			}
			else{
				out.println(""+nombre+edad+fecha+zona+sexo+temas);	
			}
			
			
			out.println("</br><a href='formulario.html'>Volver</a>");
			out.println("</body>");
			out.println("</html>");
		}
	}

}
