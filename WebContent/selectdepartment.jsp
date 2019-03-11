<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table align="center">
 <tr><td>Id</td><td>Name</td></tr>
<tr>

<td>

					<tr>
						<td><h5>${location.adminName}</h5></td>
						<td><h5>${location.address}</h5></td>
						<td><h5>${location.location}</h5></td>
						<td><h5>${location.price }</h5></td>
						<td><h5>${location.phoneNumber}</h5></td>
						<td>
						<td><button type="submit" class="btn btn-success" name="book"
								value="${location.adminId}">Book</button></td></tr>





</table>



</body>
</html>