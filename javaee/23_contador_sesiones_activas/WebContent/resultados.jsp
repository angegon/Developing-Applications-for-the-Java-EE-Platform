<%@page import="com.sun.glass.ui.Application"%>
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


	<%
		int local = 0, global = 0;
	%>
	<%-- Preguntamos si el atributo de la sessi�n es nulo, sino lo almacenamos--%>
	<%
		if (session.getAttribute("contadorValor") != null) {
			local = (Integer) session.getAttribute("contadorValor");
		}
		// Preguntamos si el atributo de la applicaci�n es nulo, sino lo almacenamos	
		if (application.getAttribute("contadorGlobal") != null) {
			global = (Integer) application.getAttribute("contadorglobal");
		}
	%>
	<h1>
		Usuarios Activos:
		<%=application.getAttribute("contadorSesionesActivas") %>
	</h1>
	<h1>
		has entrado:
		<%=local%>
		veces
	</h1>
	</br>
	</br>
	<h1>
		han entrado:
		<%=global%>
		veces
	</h1>
	</br>
	<h1>
		Fecha de �ltima visita:
		<%=obtenerCookie(request)%></h1>

</body>
</html>