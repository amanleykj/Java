<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test pagey bookie</title>
</head>
<body>
	<h1>
	Friends are New Enemies</h1>
	<p><c:out value = "${bookie.title}" /></p>
	<p><c:out value = "${bookie.description}" /></p>
	<p><c:out value = "${bookie.numberOfPages}" /></p>
	<p><c:out value = "${bookie.language}" /></p>
	<br>
	<h2>Results should be above</h2>

</body>
</html>