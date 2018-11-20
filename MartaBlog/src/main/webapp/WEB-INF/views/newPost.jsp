<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado Posts</title>
</head>
<body>
	<form:form name="submitForm" method="POST">
		<div align="center">
			<table>
				<tr>
					<td>Titulo</td>
					<td><input type="text" name="titulo""/></td>
				</tr>
				<tr>
					<td>Contenido</td>
					<td><textarea name="textarea" rows="10" cols="50"></textarea></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</table>
			<div style="color: red">${error}</div>	
		</div>
	</form:form>
</body>
</html>