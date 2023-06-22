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

<h1>New Ninja</h1>

<form:form action = "/registerNinja" mode = "post" modelAttribute = "ninja">

	<div>
		<form:label path = "dojo">Dojo</form:label>
		<form:errors path = "dojo" class = "danger-text"/>
		<form:select path = "dojo">
			<c:forEach items = "${allDojos}" var = "dojo">
			<option value = "${dojo.id}">${dojo.dojoName}</option>
			</c:forEach>
		</form:select>
	</div>
	
	<div>
		<form:label path = "firstName">First Name</form:label>
		<form:errors path = "firstName" class = "danger-text"/>
		<form:input path = "firstName" />
	</div>
	
	<div>
		<form:label path = "lastName">Last Name</form:label>
		<form:errors path = "lastName" class = "danger-text"/>
		<form:input path = "lastName" />
	</div>
	
	<div>
		<form:label path = "age">Age</form:label>
		<form:errors path = "age" class = "danger-text"/>
		<form:input path = "age" type = "number"/>
	</div>
	
	<div>
		<input type = "submit" value ="Register"/>
	</div>
	
</form:form>

<a href = "/">Main</a>

</body>
</html>