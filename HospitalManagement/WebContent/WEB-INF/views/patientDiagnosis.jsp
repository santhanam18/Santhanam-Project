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

body {
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
	<h2>Patient Diagnosis Details</h2>
	<form action="./dprocess" method="post">
		Symptoms : <br> <input type="text" name="symptoms"><br>
		Diagnosis Provided : <br> <input type="text"
			name="diagnosisProvided"><br> Administered By :<br>
		<input type="text" name="administeredBy"><br> Date of
		Diagnosis :<br> <input type="text" name="dateOfDiagnosis"><br>
		<label for="followUpRequired">Follow up Required</label><br> <select
			name="followUpRequired">
			<option value="yes">Yes</option>
			<option value="no">No</option>
		</select><br> Date of follow up : <br> <input type="text"
			name="dateOfFollowUp"><br> Bill Amount :<br> <input
			type="text" name="billAmount"><br> Card Number :<br>
		<input type="text" name="cardNumber"><br> <label
			for="modeOfPayment">Mode of Payment :</label><br> <select
			name="modeOfPayment">
			<option value="online">Online</option>
			<option value="cash">Cash</option>
		</select> <br> <br> <input type="submit" value="Submit">
	</form>
</body>
</html>