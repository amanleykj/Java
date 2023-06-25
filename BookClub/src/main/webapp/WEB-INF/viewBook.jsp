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
<title>One Book's Page</title>
</head>
<body>

<a href = "/books">Back to the shelves</a>

<div>
	
	<h2> <c:out value = "${oneBook.title}"/></h2>
	
	<c:choose>
	<c:when test ="${oneBook.user.id == user.id}">
  		<p>You read <c:out value = "${oneBook.title}"/> by <c:out value = "${oneBook.author}"/></p>
	  	<p>Here are your thoughts</p>
		<br>
		<p><c:out value = "${oneBook.myThoughts}"/></p>
		<br>
		<a href = "/book/edit/${oneBook.id}">Edit Book</a>
		<a href = "/book/delete/${oneBook.id}">Delete Book</a>
	</c:when>
	<c:otherwise>
		
		<p><c:out value = "${oneBook.user.userName}"/> read <c:out value = "${oneBook.title}"/> by <c:out value = "${oneBook.author}"/></p>
		<br>
		<p>Here are <c:out value = "${oneBook.user.userName}"/>'s thoughts</p>
		<br>
		<p><c:out value = "${oneBook.myThoughts}"/></p>
	</c:otherwise>
	</c:choose>

</div>

</body>
</html>