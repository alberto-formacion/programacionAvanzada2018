<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html; charset=ISO-8859-1" language="java" isELIgnored="false" %>
<html>
<header>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</header>
<body>
	<h2>Usuario</h2>
	<form:form method="POST" action="/springmvc/usuarios/addUsuario" modelAttribute="usuario">
	  <div class="form-group">
        <form:label for="id" path="id">ID</form:label>
	    <form:input path="id"/>
	  </div>
	  <div class="form-group">
        <form:label for="nombre" path="nombre">Nombre</form:label>
	    <form:input path="nombre"/>
	  </div>
	  <button type="submit" class="btn btn-primary">Submit</button>
	</form:form>
</body>
</html>
