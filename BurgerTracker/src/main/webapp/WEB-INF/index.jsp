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
<title>Burger Tracker</title>
</head>
<body>

<h1>Burger Tracker</h1>
<table>
    <thead>
        <tr>
            <th>Burger Name</th>
            <th>Restaurant Name</th>
            <th>Rating</th>
            <th>Notes</th>
        </tr>
    </thead>
    <tbody>
   		<c:forEach var = "burger" items = "${burgers}">
	         <tr>
	         	<td><c:out value = "${burger.name}" /></td>
	 	        <td><c:out value = "${burger.restaurant}" /></td>
	     	    <td><c:out value = "${burger.rating}" /></td>
	     	    <td><c:out value = "${burger.description}" /></td>
	         </tr>
       	</c:forEach>
    </tbody>
</table>

<br>

<h1>Add a Burger</h1>

<form:form action = "/addBurger" mode = "post" modelAttribute = "burger">

	<div>
		<form:label path = "name">Burger Name</form:label>
		<form:errors path = "name" class = "danger-text"/>
		<form:input path = "name" />
	</div>
	
	<div>
		<form:label path = "restaurant">Restaurant Name</form:label>
		<form:errors path = "restaurant" class = "danger-text"/>
		<form:input path = "restaurant" />
	</div>
	
	<div>
		<form:label path = "rating">Rating</form:label>
		<form:errors path = "rating" class = "danger-text"/>
		<form:input path = "rating" placeholder = "5" />
	</div>
	
	<div>
		<form:label path = "description">Description</form:label>
		<form:errors path = "description" class = "danger-text"/>
		<form:input path = "description" />
	</div>
	
	<div>
		<input type = "submit" value ="Submit"/>
	</div>
	
</form:form>


</body>
</html>