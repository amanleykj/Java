<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css" />
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>

<h3>おみくじ</h3>

<div id = "omikuji-box">
	<h3>
		In <c:out value = "${number}"/> years, you will live in <c:out value = "${city}"/> with 
		<c:out value = "${person}"/> as your roommate, selling <c:out value = "${endeavorHobby}"/>
		for a living. The next time you see a <c:out value = "${livingThing}"/>, you will have good luck. Also, 
		<c:out value = "${somethingNice}"/>.
	</h3>
</div>

<a href = "/omikuji">Go back</a>

</body>
</html>