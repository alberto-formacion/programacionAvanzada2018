<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado Alumnos</title>
</head>
<body>
<table>
	<tr>
		<th>Nombre</th>
		<th>Apellidos</th>
		<th>Email</th>
	</tr>
	<c:forEach items="${alumnos}" var="alumno">
		<tr>
			<td>${alumno.nombre}</td>
			<td>${alumno.apellidos}</td>
			<td>${alumno.email }</td>
		</tr>	
	</c:forEach>
</table>

</body>
</html>