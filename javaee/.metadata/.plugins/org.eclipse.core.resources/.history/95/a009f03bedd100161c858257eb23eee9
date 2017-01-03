package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String op=request.getParameter("op");
		
		String url="";
		
		switch(op){
		case "doAlta":
			url="AltaAction";
			break;
		case "doContactos":
			url="ContactosAction";
			break;
		case "doBorrar":
			url="BorrarAction";
			break;			
		case "toDatos":
			url="datos.html";
			break;
		case "toInicio":
			url="inicio.html";
			break;			
		}
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
