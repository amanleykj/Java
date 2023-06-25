
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
<title>Book Club</title>
</head>
<body>

<h1>Book Club</h1>
<h2>a place for friends to share thoughts on books</h2>

<form:form action = "/register" mode = "post" modelAttribute = "user">

	<div>
		<form:label path = "userName">Name</form:label>
		<form:errors path = "userName" class = "danger-text"/>
		<form:input path = "userName" />
	</div>
	
	<div>
		<form:label path = "email">Email</form:label>
		<form:errors path = "email" class = "danger-text"/>
		<form:input path = "email" />
	</div>
	
	<div>
		<form:label path = "password">Password</form:label>
		<form:errors path = "password" class = "danger-text"/>
		<form:input path = "password" type = "password"/>
	</div>
	
	<div>
		<form:label path = "confirmPassword">Confirm Password</form:label>
		<form:errors path = "confirmPassword" class = "danger-text"/>
		<form:input path = "confirmPassword" type = "password" />
	</div>
	
	<div>
		<input type = "submit" value ="Register"/>
	</div>
	
</form:form>

<h1>Login</h1>

<form:form action = "/login" mode = "post" modelAttribute = "loginuser">

	<div>
		<form:label path = "email">Email</form:label>
		<form:errors path = "email" class = "danger-text"/>
		<form:input path = "email" />
	</div>
	
	<div>
		<form:label path = "password">Password</form:label>
		<form:errors path = "password" class = "danger-text"/>
		<form:input path = "password" type = "password" />
	</div>
		
	<div>
		<input type = "submit" value ="Login"/>
	</div>
	
</form:form>

</body>
</html>