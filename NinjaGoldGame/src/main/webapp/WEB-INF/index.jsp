<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css" />
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Ninja Gold Game</title>
</head>
<body>

		<div>
			<p>Your gold:</p>
			<p><c:out value = "${myGold}"/></p>
		</div>
	<div id = "main">
		
		<div class = "slot">
			<form action = "findFarmGold" method = "POST">
			<h3>Farm</h3>
			<p>(earns 10-20 gold)</p>
			<button name = "findFarmGold" type = "submit" class = "basic-button">Find Gold</button>
			</form>
		</div>
		
		<div class = "slot">
			<form action = "findCaveGold" method = "POST">
			<h3>Cave</h3>
			<p>(earns 5-10 gold)</p>
			<button name = "findCaveGold" class = "basic-button">Find Gold</button>
			</form>
		</div>
		
		<div class = "slot">
			<form action = "findHouseGold" method = "POST">
			<h3>House</h3>
			<p>(earns 2-5 gold)</p>
			<button name = "findHouseGold" class = "basic-button">Find Gold</button>
			</form>
		</div>
		
		<div class = "slot">
			<form action = "findQuestGold" method = "POST">
			<h3>Quest</h3>
			<p>(earns/takes 0-50 gold)</p>
			<button name = "findQuestGold" class = "basic-button">Find Gold</button>
			</form>
		</div>

	</div>
	
	<br>
	
	<div id = "bottom">
		<p>Activities:</p>
		<span><c:out value = "${date}"/></span>
	
	
	</div>
	

</body>
</html>