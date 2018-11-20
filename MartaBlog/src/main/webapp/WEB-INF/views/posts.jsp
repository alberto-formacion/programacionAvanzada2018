<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado Posts</title>
</head>
<body>
<table border="2">
	<c:if test="${user != null}">
		<h1>Bienvenid@ ${user.rol.nombre} ${user.user}</h1>
	</c:if>
	<tr>
		<th>Titulo</th>
		<th>Contenido</th>
		<th>Autor</th>
		<c:if test="${user.rol.nombre == 'admin'}">  
		    <th>Acciones</th>	
		</c:if>  
	</tr>
	<c:forEach items="${posts}" var="p">
		<tr>
			<td>${p.titulo}</td>
			<td>${p.contenido}</td>
			<td>${p.autor.nombre}</td>
			<c:if test="${user.rol.nombre == 'admin'}">  
		    	<td>
		    		<a href="">Update</a><br/>
		    		<a href="">Delete</a><br/>
		    	</td>
			</c:if>  
		</tr>	
	</c:forEach>
</table>
<c:if test="${user.rol.nombre == 'admin'}">  
		    <a href="">Nuevo Post</a>
		</c:if>  
</body>
</html>