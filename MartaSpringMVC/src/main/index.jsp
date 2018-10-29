<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Lista de Alumnos</title>
</head>
<body>
	<h1>Listado de Alumnos</h1>  
    <table border="1">
        <tr>
            <th style="width:  50px;">ID</th>
            <th style="width: 150px;">Nombre</th>
            <th style="width: 150px;">Apellidos</th>
        </tr>
        <c:forEach var="alumno" items="${alumnos}">
            <tr>
                <td><b>${alumno.id}</b></td>
                <td>${alumno.nombre}</td>
                <td>${alumno.apellidos}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>