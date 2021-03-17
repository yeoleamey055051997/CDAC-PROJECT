<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Check in for four wheeler</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<style>
body {
	background-color: #dee9ff;
}

.registration-form {
	padding: 100px 0;
}

.registration-form form {
	background-color: #fff;
	max-width: 600px;
	margin: auto;
	padding: 30px 50px;
	border-top-left-radius: 20px;
	border-top-right-radius: 20px;
	box-shadow: 0px 2px 10px rgba(0, 0, 0, 0.075);
}

.registration-form .item {
	border-radius: 20px;
	margin-bottom: 25px;
	padding: 10px 20px;
}

.registration-form .create-account {
	border-radius: 30px;
	padding: 10px 20px;
	font-size: 18px;
	font-weight: bold;
	background-color: #5791ff;
	border: none;
	color: white;
	margin-top: 20px;
}
}
</style>
</head>
<body>
<header>
		<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
			<div class="container-fluid">
				<a class="navbar-brand" href="#">V-Park</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarCollapse"
					aria-controls="navbarCollapse" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarCollapse">
					<ul class="navbar-nav me-auto mb-2 mb-md-0">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="index.jsp">Home</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<div class="registration-form">
		<form action="submitcheckout" method="post">
			<div class="form-group">
				<label for="fname">Name :</label><br> <input type="text"
					class="form-control item" id="name" name="name" placeholder="Name"
					value="<c:out value="${park.name}"/>">
			</div>
			<div class="form-group">
				<label for="lname">Email :</label> <input type="password"
					class="form-control item" id="email" name="email"
					placeholder="Email" value="<c:out value="${park.email}"/>">
			</div>
			<div class="form-group">
				<label for="lname">ID :</label> <input type="text"
					class="form-control item" id="id" name="id"
					value='${parking_details.id}'>
			</div>
			<div class="form-group">
				<label for="lname">Floor :</label> <input type="text"
					class="form-control item" id="floar" name="floar"
					value='${parking_details.floar}'>
			</div>
			<div class="form-group">
				<button type="submit" name="por" value="Submit"
					class="btn btn-block create-account">Submit</button>
			</div>
		</form>
	</div>
<form action="submitcheckout" method="post">
		<label for="fname">Name :</label><br> <input type="text" id="name" name="name" placeholder="Name" value="<c:out value="${park.name}"/>"><br> 
		<label for="lname">Email :</label><br> <input type="text" id="email" name="email" placeholder="Email" value="<c:out value="${park.email}"/>"><br>
		<label for="lname">ID :</label><br> <input type="text" id="id" name="id" value='${parking_details.id}'><br>
		<label for="lname">Floor :</label><br> <input type="text" id="floar" name="floar" value='${parking_details.floar}'><br>
		<br> <input type="submit" name="por", value="Submit">
	</form>
</body>
</html>