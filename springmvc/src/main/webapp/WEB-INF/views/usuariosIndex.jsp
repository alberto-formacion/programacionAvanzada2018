<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" language="java" isELIgnored="false" %>
<html>
<body>
<h2>Usuarios</h2>
<form action="/springmvc/usuarios/" method="get">
	Nombre = <input name="nombre">
	<button type="submit">Enviar</button>
</form>
</body>
</html>
