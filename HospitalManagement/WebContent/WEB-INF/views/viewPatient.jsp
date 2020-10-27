<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hospital Management</title>
<style type="text/css">
input {
	padding: 6px;
	front-size: 14px;
	border-radius: 4px;
}

h1 {
	text-align: center;
}
body{
background-color: gray;
}

name {
	width: 240px;
	display: inline-block;
}
</style>
</head>
<body>
	<h1>Hospital Management</h1>
	<a href="./">Home Page</a>
	<h2>View Patient History</h2>
	<form action="./vprocess" method="post">
		First Name :<br> <input type="text" name="firstName"><br>
		Last Name :<br> <input type="text" name="lastName"><br>
		<br> <input type="submit" value="Submit">
	</form>
</body>
</html>