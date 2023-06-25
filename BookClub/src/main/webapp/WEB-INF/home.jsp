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
<title>Dashboard</title>
</head>
<body>

<h1>Welcome, ${user.userName}!</h1>
<h2>Books from everyone's shelves</h2>

<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Author Name</th>
            <th>Posted By</th>
        </tr>
    </thead>
    <tbody>
   		<c:forEach var = "allBooks" items = "${allBooks}">
	         <tr>
	         	<td><c:out value = "${allBooks.id}" /></td>
   		        <td><a href = "/books/${allBooks.id}"><c:out value = "${allBooks.title}" /></a></td>
  	         	<td><c:out value = "${allBooks.author}" /></td>
 	         	<td>
 	         	<c:choose>
 	         	<c:when test ="${oneBook.user.id == user.id}">
		  			YOU
				</c:when>
 	         	<c:otherwise>
 	         		<c:out value = "${allBooks.user.userName}" />
 	         	</c:otherwise>
         		</c:choose>
         		</td>
	         </tr>
       	</c:forEach>
    </tbody>
</table>


<a href = "/logout">Logout</a>

<a href = "/books/new">+ Add a book to your shelf</a>

</body>
</html>