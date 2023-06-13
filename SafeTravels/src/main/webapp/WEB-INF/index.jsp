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
<title>Safe Travels Main</title>
</head>
<body>

<h1>Save Travels</h1>

<table>
    <thead>
        <tr>
            <th>Expense</th>
            <th>Vendor</th>
            <th>Amount</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
   		<c:forEach var = "expense" items = "${expenses}">
	         <tr>
	 	        <td><a href = "/expenses/${expense.id}"><c:out value = "${expense.name}" /></a></td>
	 	        <td><c:out value = "${expense.vendor}" /></td>
	     	    <td>$<c:out value = "${expense.amount}" /></td>
	     	    <td>
	     	    	<a href = "/expenses/edit/${expense.id} ">Edit</a>,
	     	    	<a href = "/expenses/delete/${expense.id}" >Delete</a>
	     	    </td>
	         	<td></td>
	         </tr>
       	</c:forEach>
    </tbody>
</table>

<br>

<h1>Add Expense</h1>

<form:form action = "/addExpense" mode = "post" modelAttribute = "expense">

	<div>
		<form:label path = "name">Expense Name:</form:label>
		<form:errors path = "name" class = "danger-text"/>
		<form:input path = "name" />
	</div>
	
	<div>
		<form:label path = "vendor">Vendor:</form:label>
		<form:errors path = "vendor" class = "danger-text"/>
		<form:input path = "vendor" />
	</div>
	
	<div>
		<form:label path = "amount">Amount:</form:label>
		<form:errors path = "amount" class = "danger-text"/>
		<form:input path = "amount" type = "number"/>
	</div>
	
	<div>
		<form:label path = "description">Description</form:label>
		<form:errors path = "description" class = "danger-text"/>
		<form:input path = "description" />
	</div>
	
	<div>
		<input type = "submit" value ="Submit"/>
	</div>
	
</form:form>

</body>
</html>