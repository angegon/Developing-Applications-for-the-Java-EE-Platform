package controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.GestionContactos;

/**
 * Servlet implementation class BorrarAction
 */
@WebServlet("/BorrarAction")
public class BorrarAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		RequestDispatcher rd;
		
		GestionContactos gc = new GestionContactos();
		
		if (gc.BorrarContacto(id)){
			//Se ha añadido el contacto con normalidad.
			rd = request.getRequestDispatcher("ContactosAction");
			
		} else{
			//No se ha podido añadir el contacto
			rd = request.getRequestDispatcher("error.jsp");
			
		}	
		rd.forward(request, response);				
	}

}
