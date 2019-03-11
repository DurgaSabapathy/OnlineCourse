<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>navbar example</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

<style>
.navbar-default {
  background-color: #33AEFF;
  border-color: #d7b38c;
}
.navbar-default .navbar-brand {
  color: #d7e2e9;
}
.navbar-default .navbar-brand:hover, .navbar-default .navbar-brand:focus {
  color: #ffffff;
}
.navbar-default .navbar-text {
  color: #d7e2e9;
}
.navbar-default .navbar-nav > li > a {
  color: #d7e2e9;
}
.navbar-default .navbar-nav > li > a:hover, .navbar-default .navbar-nav > li > a:focus {
  color: #ffffff;
}
.navbar-default .navbar-nav > li > .dropdown-menu {
  background-color: #33AEFF;
}
.navbar-default .navbar-nav > li > .dropdown-menu > li > a {
  color: #d7e2e9;
}
.navbar-default .navbar-nav > li > .dropdown-menu > li > a:hover,
.navbar-default .navbar-nav > li > .dropdown-menu > li > a:focus {
  color: #ffffff;
  background-color: #d7b38c;
}
.navbar-default .navbar-nav > li > .dropdown-menu > li > .divider {
  background-color: #33AEFF;
}
.navbar-default .navbar-nav > .active > a, .navbar-default .navbar-nav > .active > a:hover, .navbar-default .navbar-nav > .active > a:focus {
  color: #ffffff;
  background-color: #d7b38c;
}
.navbar-default .navbar-nav > .open > a, .navbar-default .navbar-nav > .open > a:hover, .navbar-default .navbar-nav > .open > a:focus {
  color: #ffffff;
  background-color: #d7b38c;
}
.navbar-default .navbar-toggle {
  border-color: #d7b38c;
}
.navbar-default .navbar-toggle:hover, .navbar-default .navbar-toggle:focus {
  background-color: #d7b38c;
}
.navbar-default .navbar-toggle .icon-bar {
  background-color: #d7e2e9;
}
.navbar-default .navbar-collapse,
.navbar-default .navbar-form {
  border-color: #d7e2e9;
}
.navbar-default .navbar-link {
  color: #d7e2e9;
}
.navbar-default .navbar-link:hover {
  color: #ffffff;
}

@media (max-width: 767px) {
  .navbar-default .navbar-nav .open .dropdown-menu > li > a {
    color: #d7e2e9;
  }
  .navbar-default .navbar-nav .open .dropdown-menu > li > a:hover, .navbar-default .navbar-nav .open .dropdown-menu > li > a:focus {
    color: #ffffff;
  }
  .navbar-default .navbar-nav .open .dropdown-menu > .active > a, .navbar-default .navbar-nav .open .dropdown-menu > .active > a:hover, .navbar-default .navbar-nav .open .dropdown-menu > .active > a:focus {
    color: #ffffff;
    background-color: #d7b38c;
  }
}
</style>
</head>
<body>
<div class="container">
<h1>Online course</h1>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
    <!--   <a class="navbar-brand" href="#">Web</a> -->
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
      <!--   <li class="active"><a href="#">Home <span class="sr-only">(current)</span></a></li>
        <li><a href="https://www.jquery-az.com/php-tutorials/">PHP</a></li>
        <li><a href="https://www.jquery-az.com/jquery-tips/">jQuery</a></li>-->
            <li><a href="https://www.jquery-az.com/php-tutorials/">APPROVE TUTOR</a></li>
                    <li class="dropdown">
          <a href="https://www.jquery-az.com/bootstrap-tips-tutorials/" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">COUNTRY <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="http://localhost:8081/OnlineCourse/addcountry.html">ADD COUNTRY</a></li>
            <li><a href="">UPDATE COUNTRY</a></li>
            
            <li><a href="">DELETE COUNTRY</a></li>
          </ul>
        </li>
                  <li class="dropdown">
          <a href="https://www.jquery-az.com/bootstrap-tips-tutorials/" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">STATE <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="http://localhost:8081/OnlineCourse/addcourse.jsp">ADD STATE</a></li>
            <li><a href="">UPDATE STATE</a></li>
            
            <li><a href="">DELETE STATE</a></li>
          </ul>
        </li>
              <li class="dropdown">
          <a href="https://www.jquery-az.com/bootstrap-tips-tutorials/" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">CITY <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="http://localhost:8081/OnlineCourse/addcourse.jsp">ADD CITY</a></li>
            <li><a href="">UPDATE CITY</a></li>
            
            <li><a href="">DELETE CITY</a></li>
          </ul>
        </li>
        <li class="dropdown">
          <a href="https://www.jquery-az.com/bootstrap-tips-tutorials/" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">DEPARTMENT <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="http://localhost:8081/OnlineCourse/managedepartment.jsp">ADD DEPARTMENT</a></li>
            <li><a href="http://localhost:8081/OnlineCourse/updatedepartment.jsp">UPDATE DEPARTMENT</a></li>
            
            <li><a href="http://localhost:8081/OnlineCourse/deletedepartment.jsp">DELETE DEPARTMENT</a></li>
          </ul>
        </li>
        <li class="dropdown">
          <a href="https://www.jquery-az.com/bootstrap-tips-tutorials/" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">COURSE <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="http://localhost:8081/OnlineCourse/addcourse.jsp">ADD COURSE</a></li>
            <li><a href="">UPDATE COURSE</a></li>
            
            <li><a href="">DELETE COURSE</a></li>
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Find topics">
        </div>
        <button type="submit" class="btn btn-info">Go</button>
      </form>
       
      <!--  <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">About <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="https://www.jquery-az.com/about-us/">Terms</a></li>
            <li><a href="https://www.jquery-az.com/contact/">Contact</a></li> 
          </ul>
        </li> 
      
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
</div>
</body>
</html>

