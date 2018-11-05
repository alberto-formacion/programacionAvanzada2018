<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alta Alumno</title>
</head>
<body>
	<form:form action="${pageContext.request.contextPath}/alumnos" method="post" modelAttribute="alumno">
		<div><form:input path="nombre" placeholder="Nombre" /></div>
		<div><form:input path="apellidos" placeholder="Apellidos" /></div>
		<div><form:input path="email" placeholder="Email"/></div>
		<button type="submit">Enviar</button>
	</form:form>
</body>
</html>