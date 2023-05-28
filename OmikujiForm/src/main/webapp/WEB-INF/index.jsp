<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css" />
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<meta charset="ISO-8859-1">
<title>Omikuji Form</title>
</head>
<body>

<h2>おみくじを送ります</h2>

<form action = "/create" method = "POST">
	<div class = "mb-3">
		<label for = "number" >Pick any number from 5 to 25</label>
		<select name = "number" >
			<option value = 5>5</option>
			<option value = 6>6</option>
			<option value = 7>7</option>
			<option value = 8>8</option>
			<option value = 9>9</option>
			<option value = 10>10</option>
			<option value = 11>11</option>
			<option value = 12>12</option>
			<option value = 13>13</option>
			<option value = 14>14</option>
			<option value = 15>15</option>
			<option value = 16>16</option>
			<option value = 17>17</option>
			<option value = 18>18</option>
			<option value = 19>19</option>
			<option value = 20>20</option>
			<option value = 21>21</option>
			<option value = 22>22</option>
			<option value = 23>23</option>
			<option value = 24>24</option>
			<option value = 25>25</option>
		</select>
	</div>
	<div class = "mb-3">
		<label>Enter the name of any city: </label>
		<input type = "text" name = "city">
	</div>
	<div>
		<label>Enter the name of any real person: </label>
		<input type = "text" name = "person">
	</div>
	<div>
		<label>Enter professional endeavor or hobby: </label>
		<input type = "text" name = "endeavorHobby">
	</div>
	<div>
		<label>Enter any type of living thing: </label>
		<input type = "text" name = "livingThing">
	</div>
	<div>
		<label>Say something nice to someone: </label>
		<input type = "text" name = "somethingNice">
	</div>
	
	<p>Send and show a friend by clicking below.</p>
	
	<button>Send</button>

</form>

</body>
</html>