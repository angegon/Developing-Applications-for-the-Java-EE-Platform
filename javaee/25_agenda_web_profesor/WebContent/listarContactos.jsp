<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="javabeans.*, modelo.*, java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<% ArrayList<Contacto> Contactos = new ArrayList<>();
		GestionContactos gc = new GestionContactos();		
		//Obtenemos los contactos de la BBDD
		Contactos = gc.ListarContactos();%>
		
			<table border='1'>
			<th colspan='11' style='background-color: yellow;font-size:35px'>Contactos</th>
			<tr>
			<td>Nombre</td>
			<td>Email</td>
			<td>telefono</td>
			</tr>	
			
			<%for (Contacto c: Contactos){ %>
				<tr>
				<td><%=c.getNombre() %></td>
				<td><%=c.getEmail()%></td>
				<td><%=c.getTelefono()%></td>
				</tr>
			<%}%>
			</table>	
			</br></br>
			<a href="inicio.html">Volver</a>
				
</body>
</html>