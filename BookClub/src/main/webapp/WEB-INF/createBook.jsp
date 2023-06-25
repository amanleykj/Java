
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
<title>Insert title here</title>
</head>
<body>

<a href = "/books">Back to the shelves</a>

<h1>Add a Book to your Shelf, ${user.userName}!</h1>

<form:form action = "/createBook" mode = "post" modelAttribute = "book">

	<div>
		<form:label path = "title">Title</form:label>
		<form:errors path = "title" class = "danger-text"/>
		<form:input path = "title" />
	</div>
	
	<div>
		<form:label path = "author">Author</form:label>
		<form:errors path = "author" class = "danger-text"/>
		<form:input path = "author" />
	</div>
	
	<div>
		<form:label path = "myThoughts">Your thoughts on this book</form:label>
		<form:errors path = "myThoughts" class = "danger-text"/>
		<form:input path = "myThoughts" />
	</div>
	
	<div>
		<form:errors path="user" class="error"/>
		<form:input type="hidden" path="user" value="${user.id}"/>
	</div>
		
	<div>
		<input type = "submit" value ="Register"/>
	</div>
	
</form:form>

<a href = "/logout">Logout</a>
<a href = "/books">Main</a>

</body>
</html>