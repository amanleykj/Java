<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css" />
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Fruity Loops</title>
</head>
<body>

<h1>Fruit Store</h1>
	<table class = "table table-striped">
		<thead>
			<tr>
				<th>Name</th>
				<th>Price</th>
			</tr>	
		</thead>
		
		<tbody>
			<c:forEach var = "oneThing" items = "${fruits}">
			<tr>
				<td><c:out value = "${oneThing.name}"></c:out></td>
				<td><c:out value = "${oneThing.price}"></c:out></td>
			</tr>	
			</c:forEach>
		</tbody>
	
	</table>

</body>
</html>