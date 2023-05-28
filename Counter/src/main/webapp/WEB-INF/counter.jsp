<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css" />
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Current Visit Count</title>
</head>
<body>

<h1>You have visited "http://localhost:8080/your_server" <c:out value = "${number}"/> times</h1>

<h2><a href = "/your_server">Test another visit?</a></h2>
<h2><a href = "/your_server_double">How about a double?</a></h2>

<br>
<h2><a href = "/shutdown" >Do you want a full reset? Click here.</a></h2>

</body>
</html>