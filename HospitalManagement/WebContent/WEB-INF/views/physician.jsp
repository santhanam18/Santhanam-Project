<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hospital Management</title>
<style type="text/css">
input,select {
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

label {
	width: 240px;
	display: inline-block;
}
</style>
</head>
<body>
<h1>Hospital Management</h1>
<a href="./">Home Page</a>
	<h2>Add Physician</h2>
	<form action="./pprocess" method="post">
		First Name : <br>
		<input type="text" name="phyFirstName"><br> Last Name : <br>
		<input type="text" name="phyLastName"><br> Department :<br>
		<input type="text" name="department"><br> Educational
		Qualification : <br>
		<input type="text" name="educationalQualification"><br>
		Years of Experience :<br> <input type="text"
			name="yearsOfExperience"><br><label for="phyState">State :</label><br>
		<select name="phyState">
		<option value="tamilnadu">Tamil_Nadu</option>
		<option value="andrapradesh">Andra_Pradesh</option>
		<option value="hyderabad">Hyderabad</option>
		</select>
		<br>
		<label for="phyInsurancePlan">Insurance Plan :</label><br> <select name="phyInsurancePlan">
		<option value="life">Life</option>
		<option value="medical">Medical</option>
		</select><br> <br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>