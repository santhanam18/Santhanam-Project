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
	<h2>Physician Search</h2>
	<form action="./psprocess" method="post">
		State : <br> <input type="text" name="phyState"><br>
		Plan :<br> <input type="text" name="plan"><br>
		Department :<br> <input type="text" name="department"><br>
		<br> <input type="submit" value="Search"> <input
			type="submit" value="Reset">
	</form>
</body>
</html>