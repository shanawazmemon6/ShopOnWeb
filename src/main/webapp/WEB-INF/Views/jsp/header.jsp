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
color: #ffffff;  

/*Sets the text hover color on navbar*/
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
background-color: #041f3e;
color: #ffffff;
 padding: 15px ;
 box-shadow:5px 5px 20px #000;
}
.dropdown-menu{
 margin-left: 16px;
  margin-right: 16px;
  padding: 20px 0px;
  left:auto;
 background-image: none;
}



.caret-up {
    width: 0; 
    height: 0; 
    border-left: 4px solid rgba(0, 0, 0, 0);
    border-right: 4px solid rgba(0, 0, 0, 0);
    border-bottom: 4px solid;
    
    display: inline-block;
    margin-left: 2px;
    vertical-align: middle;
}

</style>

<!-- <script>
$(function(){
    $(".dropdown").hover(            
            function() {
                $('.dropdown-menu', this).stop( true, true ).fadeIn("fast");
                $(this).toggleClass('open');
                $('b', this).toggleClass("caret caret-up");                
            },
            function() {
                $('.dropdown-menu', this).stop( true, true ).fadeOut("fast");
                $(this).toggleClass('open');
                $('b', this).toggleClass("caret caret-up");                
            });
    });
    
</script> -->
   
   
   
   
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
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#" style="background-color:#072f52; color:#ffffff;"> Sign In
         <b class="caret"></b></a>
        <ul class="dropdown-menu" style="background-color:#072f52;">
          <li><a href="#"  style="color:#ffffff;"><span class="glyphicon glyphicon-user">  SignUp</a></li>
          <br>
          <li><a href="#" style="color:#ffffff;"><span class="glyphicon glyphicon-log-in"> Login</a></li>
          
        </ul>
      </li>
    </ul>
      </div>
     
  </div>

  </nav>




