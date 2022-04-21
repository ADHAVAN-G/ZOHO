<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="allocateSeat">
	<h1>Welcome to seat booking system</h1>
	Enter your name : <input type="text" name="name"><br>
	Enter your mobile number : <input type="text" name="mobilenumber"><br>
	Enter the tickets : <input type="number" name="tickets" min="1"><br>
	<input type="submit" value="book">
	</form>
</body>
</html>