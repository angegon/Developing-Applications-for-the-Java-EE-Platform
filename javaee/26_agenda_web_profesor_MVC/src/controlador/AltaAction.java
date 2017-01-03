package controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.GestionContactos;


@WebServlet("/AltaAction")
public class AltaAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nombre = request.getParameter("nombre");
		String email = request.getParameter("email");
		Integer telefono = Integer.parseInt(request.getParameter("telefono"));
		RequestDispatcher rd;
		
		GestionContactos gc = new GestionContactos();
		
		
		if (gc.GuardarContacto(nombre, email, telefono)){
			//Se ha añadido el contacto con normalidad.
			rd = request.getRequestDispatcher("inicio.html");
			
		} else{
			//No se ha podido añadir el contacto
			rd = request.getRequestDispatcher("error.jsp");
			
		}	
		rd.forward(request, response);		
	}

}
