<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
	<table border='1'>
	<th colspan='11' style='background-color: yellow;font-size:35px'>Tablas de multiplicar</th>
			<%for(int i=1;i<=10;i++){%>
				<tr>
				<td style='background-color: yellow;font-size:25px;font-weight:bold' >Tabla del <%=i%></td>
				<%for (int j=1;j<=10;j++){%>
					<td style='background-color: green; font-size:20px;font-weight:bold'> <%=i%> x <%=j%> =<%=i*j%> </td>
				<% }%>	
				</tr>
			<% }%>

	</table>		
	</center>
</body>
</html>