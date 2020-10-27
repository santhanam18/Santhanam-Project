<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hospital Management</title>
<style type="text/css">
input, select {
	padding: 6px;
	front-size: 14px;
	border-radius: 4px;
}

body {
	background-color: gray;
}

h1 {
	text-align: center;
}

label {
	width: 240px;
	display: inline-block;
}
</style>
</head>
<body>
	<h1>Hospital Management</h1>
	<a href="./">Home Page</a>
	<h2>Enroll Patient</h2>
	<form action="./process" method="post">
		First Name :<br> <input type="text" name="firstName"><br>
		Last Name :<br> <input type="text" name="lastName"><br>
		Password : <br> <input type="text" name="password"><br>
		Date of Birth : <br> <input type="text" name="dateOfBirth"><br>
		Email : <br> <input type="text" name="email"><br>
		Contact Number :<br> <input type="text" name="contactNumber"><br>
		<label for="state">State :</label><br> <select name="state">
			<option value="tamilnadu">Tamil_Nadu</option>
			<option value="andrapradesh">Andra_Pradesh</option>
			<option value="hyderabad">Hyderabad</option>
		</select> <br> <label for="insurancePlan">Insurance Plan :</label><br>
		<select name="insurancePlan">
			<option value="life">Life</option>
			<option value="medical">Medical</option>
		</select><br> <br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>