
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix ="form" uri= "http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<link rel="stylesheet" href="/css/style.css" />
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojos and Ninjas</title>
</head>
<body>

<h1>New Dojo</h1>

<form:form action = "/registerDojo" mode = "post" modelAttribute = "dojo">

	<div>
		<form:label path = "dojoName">Name</form:label>
		<form:errors path = "dojoName" class = "danger-text"/>
		<form:input path = "dojoName" />
	</div>
	
	<div>
		<input type = "submit" value ="Register"/>
	</div>
	
</form:form>

<a href = "/">Main</a>

</body>
</html>