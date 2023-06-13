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
<title>Safe Travels Edit</title>
</head>
<body>

<h1>Edit Expense</h1>
<p><a href = "/">Go back</a></p>

<form:form action = "/expenses/${expense.id}" mode = "post" modelAttribute = "expense">
	<input type = "hidden" name = "_method" value = "put">
	<div>
		<form:label path = "name">Expense Name:</form:label>
		<form:errors path = "name" class = "danger-text"/>
		<form:input path = "name" />
	</div>
	
	<div>
		<form:label path = "vendor">Vendor:</form:label>
		<form:errors path = "vendor" class = "danger-text"/>
		<form:input path = "vendor" />
	</div>
	
	<div>
		<form:label path = "amount">Amount:</form:label>
		<form:errors path = "amount" class = "danger-text"/>
		<form:input path = "amount" type = "number"/>
	</div>
	
	<div>
		<form:label path = "description">Description:</form:label>
		<form:errors path = "description" class = "danger-text"/>
		<form:input path = "description" />
	</div>
	
	<div>
		<input type = "submit" value ="Submit"/>
	</div>
	
</form:form>

</body>
</html>