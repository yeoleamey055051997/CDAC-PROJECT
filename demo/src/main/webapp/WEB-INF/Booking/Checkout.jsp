<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="submitcheckout" method="post">
		<label for="fname">Name :</label><br> <input type="text" id="name" name="name" placeholder="Name"><br> 
		<label for="lname">Email :</label><br> <input type="text" id="email" name="email" placeholder="Email"><br>
		<label for="lname">ID :</label><br> <input type="text" id="id" name="id" value='${parking_details.id}'><br>
		<label for="lname">Floor :</label><br> <input type="text" id="floor" name="floor" value='${parking_details.floar}'><br>
		<br> <input type="submit" name="por", value="Submit">
	</form>
</body>
</html>