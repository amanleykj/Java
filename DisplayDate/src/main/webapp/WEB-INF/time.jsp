<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Time</title>
	<link rel="stylesheet" href="/css/style.css">
</head>
<body>

<h2 class = "dateTime"><c:out value = "${time}" /></h2>

<script src="/js/scriptTime.js"></script>
</body>
</html>