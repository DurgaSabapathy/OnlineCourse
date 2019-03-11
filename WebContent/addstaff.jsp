<%@page import="java.util.ArrayList"%>
<%@page import="chainsys.com.dao.CountryDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"> 

  <style type="text/css">
  body
  {
  background-image:url("image2.jpg");
  }
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
.jumb {
    margin-bottom: 0px;
  min-height: 100px;
  min-width: 100px;
  
   
    color: white;
  background-color: #d3d3d3;
}
input[type=password] {
  border-radius: 10px;
  border: 2px solid #73AD21;
  padding: 10px; 
  width: 200px;
  height: 40px; 
   
   
}
input[type=date]
 {
   border-radius: 10px;
  border: 2px solid #73AD21;
  padding: 10px; 
  width: 200px;
  height: 40px; 
 }
 
 button
 {
  border-radius: 10px;
  border: 2px solid #ffffff;
    height: 40px;
    width:120px;
    font-weight: bold;
    
  background-color: #73AD21;
 }
::placeholder
{
 opacity: 0.4;
}

table
{
    border-collapse:separate;
    border-spacing:0 5px;
    text-align:center; 
    margin-left:auto; 
    margin-right:auto; 
    width:100px;
}
  </style>
</head>
<body>

  
  <form action="AddStaffServlet" method="post">

   <div class="container"> 
<h4 align="center" >ADD STAFF DETAILS</h4>
<table>

<tr><td colspan="2" align="center"><h4>SIGN UP!!!</h4></td></tr>

  
 <tr><td> NAME:</td><td><input type="text" name="name"  placeholder="NAME" aria-label="NAME" required ></td><tr>
 <tr><td> EMAIL:</td><td><input type="email" name="email"  placeholder="EMAIL" aria-label="EMAIL"  required  ></td><tr><tr>
<tr><td>PASSWORD:</td><td><input type="password" name="password"  placeholder="PASSWORD" aria-label="PASSWORD"  required  ></td><tr>
<tr><td>GENDER:</td><td><input type="radio" name="gender" id="male" value="male" placeholder="GENDER" aria-label="GENDER"  required > <label for="male"> MALE</label>
<input type="radio" id="female" name="gender" value="female" placeholder="GENDER" aria-label="GENDER" > <label for="female"  >FEMALE</label></td><tr>

 <tr><td>DATE OF BIRTH:</td><td><input type="date" id="datepicker" name="dateofbirth"  required ></td><tr>
 
 <tr><td>ADDRESS:</td><td><input type="text" name="address"  placeholder="ADDRESS" aria-label="ADDRESS"  required ></td><tr>
    

      
   <tr><td> MOBILE:</td><td><input type="text" name="mobile"  placeholder="MOBILE" aria-label="MOBILE"  required ></td><tr>
    <tr><td>QUALIFICATION:</td><td><input type="text" name="qualification"  placeholder="QUALIFICATION" aria-label="QUALIFICATION"   required ></td><tr>
 
  
    <tr><td>DESIGNATION:</td><td><input type="text" name="profession"  placeholder="DESIGNATION" aria-label="DESIGNATION"  required ></td><tr>
 <tr><td>WOKRING PLACE:</td><td><input type="text" name="workingplace"  placeholder="WORKING PLACE" aria-label="WORKING PLACE"  required ></td><tr>
    <tr><td>ADDRESS OF THE OFFICE:</td><td><input type="text" name="addressoffice"  placeholder="ADDRESS OF THE WORKING PLACE" aria-label="ADDRESS OF THE WORKING PLACE"  required ></td><tr>
    
 <tr><td colspan=
 "2" align="center"> <button type="submit">Register</button></td></tr>
 
  
  
 
 
  
 
  
 
  
  
  

</table>
</div>
 
</form>



</body>
</html>