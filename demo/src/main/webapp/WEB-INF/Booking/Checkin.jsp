<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="submitcheckin" method="post">
		<label for="fname">Name :</label><br> <input type="text" id="name" name="name" placeholder="Name" value="<c:out value="${park.name}"/>"><br> 
		<label for="lname">Email :</label><br> <input type="text" id="email" name="email" placeholder="Email" value="<c:out value="${park.email}"/>"><br>
		<label for="lname">ID :</label><br> <input type="text" id="id" name="id" value='${parking_details.id}'>
		<!-- <input type="hidden" id="id" name="id" value="<c:out value="${parking_details.id}"/>"> --><br>
		<label for="lname">Floor :</label><br> <input type="text" id="floar" name="floar" value='${parking_details.floar}'>
		<!--<input type="hidden" id="floar" name="floar" value="<c:out value="${parking_details.floar}"/>"> --><br>
		<br> <input type="submit" name="por", value="Submit">
	</form>
</body>
</html>