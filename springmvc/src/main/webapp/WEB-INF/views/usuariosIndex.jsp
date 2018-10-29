<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" language="java" isELIgnored="false" %>
<html>
<body>

<!-- https://www.tutorialspoint.com/jsp/jsp_standard_tag_library.htm -->

	<h2>Usuarios</h2>
	Nombre = <input id="nombre">
	<button onclick="goTo()">Enviar</button>
<script>
	function goTo(){
		window.location = "/springmvc/usuarios/" + document.querySelector("#nombre").value
	}
</script>
</body>
</html>
