<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

  <meta name="viewport" content="width=device-width, initial-scale=1">  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"> 
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>  
<title>Insert title here</title>
<style type="text/css">
input[type=text] {
	border-radius: 10px;
	border: 2px solid #73AD21;
	padding: 10px;
	width: 200px;
	height: 40px;
}

label {
	font-weight: normal !important;
}

input[type=email] {
	border-radius: 10px;
	border: 2px solid #73AD21;
	padding: 10px;
	width: 200px;
	height: 40px;
}

input[type=password] {
	border-radius: 10px;
	border: 2px solid #73AD21;
	padding: 10px;
	width: 200px;
	height: 40px;
}
input[type=number] {
	border-radius: 10px;
	border: 2px solid #73AD21;
	padding: 10px;
	width: 200px;
	height: 40px;
}

select {
	border-radius: 10px;
	border: 2px solid #73AD21;
	padding: 10px;
	width: 200px;
	height: 40px;
}

input[type=date] {
	border-radius: 10px;
	border: 2px solid #73AD21;
	padding: 10px;
	width: 200px;
	height: 40px;
}

button {
	border-radius: 10px;
	border: 2px solid #ffffff;
	height: 40px;
	width: 120px;
	font-weight: bold;
	background-color: #73AD21;
}

::placeholder {
	opacity: 0.4;
}

table {
	border-collapse: separate;
	border-spacing: 0 5px;
	text-align: center;
	margin-left: auto;
	margin-right: auto;
	width: 200px;
}



</style>

<script type="text/javascript">
	$(document).ready(function() {
		
			$.ajax({
				url : 'FindDepartmentNameServlet',
				type: 'GET',
				success : function(responseText) {
					var value=responseText.split(',');
				
					
					for(var item in value)
						{
						
							$('#second').append("<option value="+value[item]+">"+value[item]);
						
					console.log(responseText);
					$('#ajaxGetUserServletResponse').text(responseText);
				}
				}});
		});
	
</script>
	<script type="text/javascript">
	$(document).ready(function() {
		
			$.ajax({
				url : 'FindStaffNameServlet',
				type: 'GET',
				success : function(responseText) {
					var value=responseText.split(',');
				
					for(var item in value)
						{
						
							$('#first').append("<option value="+value[item]+">"+value[item]);
						}
					console.log(responseText);
					$('#ajaxGetUserServletResponse').text(responseText);
				}
			});
		});
</script>
</head>
<body>

<form method="post" action="AddCourseServlet">
		<table>
			<tr>
				<td>Enter id:</td>
			<td><input type="text" name="idd"
					></td>
				
			</tr>
			<tr><td>
			Select department name:</td>
				<td>	<select name="departmentid" id="second">
		<option value="-1">Select
		</option>
			</select></td>
			</tr>
			<tr><td>
			Enter Course name:</td>
				<td><input type="text" name="name" 
					></td>
			</tr>
			<tr>
			<tr><td>
			Enter fees:</td>
				<td><input type="number" name="fees" 
					></td>
			</tr>
			<tr><td>
			Enter Staff:</td>
				<td>	<select name="staffid" id="first">
		<option value="-1">Select
		</option>
			</select></td>
			</tr>
			<tr><td>
			Enter Start Date:</td>
				<td><input type="date" name="startdate" 
					></td>
			</tr>
			<tr><td>
			Enter End Date:</td>
				<td><input type="date" name="enddate" 
					></td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit">INSERT COURSE</button></td>
			
			</tr>
			<tr>
			<td colspan="2">${status}
			</td>
			</tr>
		</table>
		</form>


</body>
</html>