<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" language="java" isELIgnored="false" %>
<html>
<body>
<h2>TODOS</h2>
<ul>
<c:forEach items="${todos}" var="todo">
	<li>${todo.text}</li>
</c:forEach>
</ul>
</body>
</html>
