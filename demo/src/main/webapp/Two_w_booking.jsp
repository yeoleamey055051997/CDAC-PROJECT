<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
	border: 1px solid black;
}
</style>
</head>
<body>

	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Floor</th>
				<th>Booking_status</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="listall1" items="${listall1}">
				<tr>
					<td><c:out value="${listall1.id}" /></td>
					<td><c:out value="${listall1.floor}" /></td>
					<td>
						<form action="checkin" method="get" id="form1">
							<button type="submit" form="form1" value="por">CheckIn</button>
						</form> 
						<form action="checkout" method="get" id="form2">
							<button type="submit" form="form2" value="por">Checkout</button>
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>

</body>
</html>