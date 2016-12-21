package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/comprobarPassword")
public class comprobarPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String password = request.getParameter("password");
		RequestDispatcher rd;
		
		if (password.equals("curso")){
			rd = request.getRequestDispatcher("bienvenida");
			//la contraseña ya va en el requesto, no hace falta ponerla
		} else{
			rd = request.getRequestDispatcher("error?password2="+password);
			//la contraseña ya va en el requesto, no hace falta ponerla, pero la ponemos...
		}
		
		//instanciamos al nuevo servlet llamando a su service, pasando los parametros request y response.
		rd.forward(request, response);
		
	}

}
