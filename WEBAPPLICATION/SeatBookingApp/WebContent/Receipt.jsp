<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>RECEIPT</h2>
	<p>Name : ${name }</p>
	<p>Mobile number : ${mobilenumber }</p>
	<p>Amount : ${totalAmount }</p>
	<p>Seat Number : ${seats }</p>
	<form action="Create.jsp">
	<input type="submit" value="download">
	</form>
</body>
</html>