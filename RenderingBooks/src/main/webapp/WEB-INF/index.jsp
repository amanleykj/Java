<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Books</title>
</head>
<body>
  
<h1>All Books</h1>
<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Language</th>
            <th>Number of Pages</th>
        </tr>
    </thead>
    <tbody>
    		<c:forEach var = "oneThing" items = "${books}">
         <tr>
         	<td><c:out value = "${oneThing.id}" /></td>
 	        <td><a href = "/books/<c:out value = "${oneThing.id}" />"><c:out value = "${oneThing.title}" /></a></td>
     	    <td><c:out value = "${oneThing.language}" /></td>
     	    <td><c:out value = "${oneThing.numberOfPages}" /></td>
         </tr>
         	</c:forEach>
    </tbody>
</table>


</body>
</html>