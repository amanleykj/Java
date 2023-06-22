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
<title>Dojos and Ninjas</title>
</head>
<body>

<table>
    <thead>
        <tr>
            <th>Dojo</th>
            <th>Notes</th>
        </tr>
    </thead>
    <tbody>
   		<c:forEach var = "dojo" items = "${dojos}">
	         <tr>
	         	<td><a href = "/dojos/${dojo.id}"}><c:out value = "${dojo.dojoName}" /></a></td>
	     	    <td>nothing for now</td>
	         </tr>
       	</c:forEach>
    </tbody>
</table>

<br>

<a href = "/dojos/new">Dojo</a>
<a href = "/ninjas/new">Ninja</a>



</body>
</html>