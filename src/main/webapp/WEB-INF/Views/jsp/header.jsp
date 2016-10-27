<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
   
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   <link rel="stylesheet" href="css/navstyle.css"/>
  <style>
.navbar-default .navbar-nav > li > a:hover, .navbar-default .navbar-nav > li > a:focus {
color: #ffffff;  /*Sets the text hover color on navbar*/
}
.navbar-default .navbar-nav > .active > a, .navbar-default .navbar-nav > .active >   
 a:hover, .navbar-default .navbar-nav > .active > a:focus {
color: white; /*BACKGROUND color for active*/
background-color:#f2613c;
}
.navbar-custom .navbar-nav > li > a {
   color: white; /*Change active text color here*/
    }
	
.navbar-custom .navbar-toggle {
    border-color: #041f3e;
}
.navbar-custom .navbar-toggle:hover,
.navbar-custom .navbar-toggle:focus {
    background-color: #f2613c;
}
.navbar-custom .navbar-toggle .icon-bar {
    background-color: #ffffff;
}
.navbar-custom .navbar-collapse{
	border-color:#051221;
	
	}
	
	

.navbar-custom .navbar-collapse .nav > li > a:hover,
.navbar-custom .navbar-collapse .dropdown-menu a:hover {
background-color: #f2613c;


color: #ffffff;
}</style>

   
   
   
   
</head>
<body data-spy="scroll" data-target=".navbar" data-offset="50" >

<div class="container-fluid" style="background-color:#072f52;" >
   <a class="brand"><img  src="images/insta.gif" ></a>

</div>

  <nav class="navbar navbar-default navbar-custom" data-spy="affix" data-offset-top="197" role="navigation">

  <div class="container-fluid">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
      </button>
           <a class="navbar-brand visible-xs" href="#" style="color:#ffffff;">ShopOnWeb</a>
     
    </div>
      <div class="collapse navbar-collapse" id="myNavbar">
        <ul class="nav navbar-nav">
          <li id="home"><a href="launchrequest">HOME</a></li>
          <li id="mens" ><a href="">MENS</a></li>
          <li id="womens"><a href="">WOMENS</a></li>
		  <li id="kids"><a href="">KIDS</a></li>
		  </ul>
		   <ul class="nav navbar-nav navbar-right">
      <li><a href="registerrequest" ><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="loginrequest" class="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
      </div>
     
  </div>

  </nav>




