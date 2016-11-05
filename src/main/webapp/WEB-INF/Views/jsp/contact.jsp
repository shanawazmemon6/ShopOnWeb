<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ShopOnWeb</title>
<style>
body {
    background: url("images/bluredimg.jpg")no-repeat fixed top center;
    
}
#logo {
     margin-top:50px;
	width: 20%;
	align:right;
}
#contact_12span{
background-color:#52847F;
color:#ffffff;
margin-top:20px;
box-shadow: 5px 5px 15px #000;
height:500px;
}
#contact_6span{

background:url("images/backgrond_contact.jpg");
box-shadow: 5px 5px 15px #000;
}

#input_contact{
margin-top:10px;
padding:10px;
}
#logo2 {
	width: 50%;
	margin-bottom:25px;
}
#logo3{

width: 80%;
}
.set{
margin-left:15px;
}

</style>
</head>
<body>
<div class="container-fluid " >
		<div class="jumbotron text-center hello" id="contact_12span">
			<img alt="brand-logo" id="logo" src="images/cs.png" />
			<h2>Please get in touch if you have any questions</h2>
			<a href="#section1" class="btn btn-danger"><b>Contact</b></a>
			</div>
			
			<div class="container" id="section1">
			<div class="col-sm-6" >
			<div class="jumbotron text-center" id="contact_6span">
			<img src="images/telephone.png" alt="contact_telephone" id="logo3"/>
			<br>
			<a class="btn btn-danger set">Call Us</a>
			<h1>18006001234</h1>
			
			
			</div>
			
			</div>
			<div class="col-sm-6">
			<div class="jumbotron text-center" id="contact_6span">
			<img alt="contact" src="images/contactus.png" id="logo2" >
			<form action="/" class="form-group">
			<input type="text" class="form-control" placeholder="Name" id="input_contact"/>
			<input type="text" class="form-control" placeholder="Email Id"  id="input_contact"/>
			<input type="text" class="form-control" placeholder="Phone Number" id="input_contact"/>
			<textarea class="form-control" placeholder="Complaint" id="input_contact"></textarea>
			<input type="button" class="btn btn-danger" value="Complain" id="input_contact">
			</form>
			</div>
			</div>
			</div>
			</div>
</body>
</html>