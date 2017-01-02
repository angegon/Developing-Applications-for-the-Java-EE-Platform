<%@page import="javax.websocket.Session, java.time.LocalDate, java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%!private String obtenerCookie(HttpServletRequest request) {
		String valor = "";
		Cookie[] todas = request.getCookies();
		if (todas != null) {
			for (Cookie ck : todas) {
				if (ck.getName().equals("visita")) {
					valor = ck.getValue();
					break;
				}
			}
		}
		return valor;
	}%>
	
			</br><h1>Bienvenido a mi página <%=session.getAttribute("usuarioSesion") %></h1>
			</br><%=LocalDate.now()%>
			</br><a href='Final?atributo=deportes'>Deportes</a>
			</br><a href='Final?atributo=cine'>Cine</a>
			</br><a href='Final?atributo=musica'>Musica</a>;
			</br><a href='cerrarSesion'>Cerrar Sesión</a>
</body>
</html>