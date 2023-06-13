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
<title>Edit a Booger</title>
</head>
<body>

<h1>Edit Burger</h1>

<form:form action="/burgers/${burger.id}" method="post" modelAttribute="burger">
    <input type="hidden" name="_method" value="put">
    <p>
        <form:label path="name">Burger Name</form:label>
        <form:errors path="name" class = "danger-text"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="restaurant">Restaurant</form:label>
        <form:errors path="restaurant" class = "danger-text"/>
        <form:input path="restaurant"/>
    </p>
    <p>
        <form:label path="rating">Rating</form:label>
        <form:errors path="rating" class = "danger-text"/>     
        <form:input type="number" path="rating"/>
    </p>    
    <p>
        <form:label path="description">Description</form:label>
        <form:errors path="description" class = "danger-text"/>
        <form:textarea path="description"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form>

</body>
</html>