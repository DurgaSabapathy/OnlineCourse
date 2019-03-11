<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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

input[type=date] {
	border-radius: 10px;
	border: 2px solid #73AD21;
	padding: 10px;
	width: 180px;
	height: 35px;
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
						
							$('#firstcombo').append("<option value="+value[item]+">"+value[item]);
						
					console.log(responseText);
					$('#ajaxGetUserServletResponse').text(responseText);
				}
				}});
		});
	
</script>

</head>
<body>
  <form method="post" action="DeleteDepartmentServlet">

	


	
		<table>
			<tr>
				
		<td>	<select name="departmentid" id="firstcombo">
		<option value="-1">Select
		</option>
			</select></td>
				
			</tr>
			
			<tr>
				<td colspan="2"><button type="submit">DELETE</button></td>
			
			</tr>
			<tr>
			<td colspan="2">${status}
			</td>
			</tr>
		</table>
</form>
</body>
</html>