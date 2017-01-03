package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javabeans.Contacto;
import modelo.GestionContactos;


@WebServlet("/ContactosAction")
public class ContactosAction extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ArrayList<Contacto> Contactos = new ArrayList<>();
		GestionContactos gc = new GestionContactos();
		
		//Obtenemos los contactos de la BBDD
		Contactos = gc.ListarContactos();	
		
		//se lo pasamos al jsp, con un atributo de petición, porque request y no session, porque una vez mostrados los contactos
		//no necesitan ser almacenados en memoria.		
		request.setAttribute("contactos", Contactos);
		
		request.getRequestDispatcher("listarContactos.jsp").forward(request, response);
	}

}
