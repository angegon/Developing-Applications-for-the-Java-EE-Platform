package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javabeans.Producto;


@WebServlet("/Agregar")
public class Agregar extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArrayList<Producto> carrito = null;
		
		Producto p= new Producto(request.getParameter("nombre"), Double.parseDouble(request.getParameter("precio")), request.getParameter("categoria"));
				
		HttpSession hs=request.getSession();
		
		if(hs.getAttribute("carrito")!=null){
			carrito = (ArrayList<Producto>)hs.getAttribute("carrito");
			carrito.add(p);			
			//hs.setAttribute("carrito", carrito);//No hace falta ya est� en sesi�n.
		}
		else{
			carrito=new ArrayList<>();
			carrito.add(p);
			hs.setAttribute("carrito", carrito);
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("inicio.html");
		rd.forward(request, response);
		
	}

}
