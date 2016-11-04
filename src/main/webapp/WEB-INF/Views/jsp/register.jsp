<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/loginstyle.css"/>
<style >
body {
    background-image: url("images/bluredimg.jpg");
    
}
.inputone{
	padding:20px;
margin-top:10px;
	
}
.inputtwo{
	padding:5px;
margin-top:10px;
	
}
</style>
</head>
<body>
<div class="container">

<div class="row vertical-offset-100"  >
<div class="col-md-3 col-md-offset-8">
<div class="form-group" id="">
 <img src="images/bag.png" class="logo"  class="img-responsive"> 

<f:form action="registerrequest" method="POST" modelAttribute="register">
<f:input path="email_register" type="email" class="form-control inputone" placeholder="Email Id" required="true"></f:input>
<f:input path="password_register" type="password" class="form-control inputone" required="true" placeholder="Password"></f:input>
<f:input path="confirmpass_register" type="password" class="form-control inputone" placeholder="Confirm Password" required="true"></f:input>
<f:input path="number_register" type="tel" class="form-control inputone" required="true" placeholder="Phone Number"></f:input>
<f:input path="dob_register" type="date" class="form-control inputone" placeholder="Date" required="true"></f:input>
<f:select path="gender_register" items="${gender}" class="form-control inputtwo" ></f:select>
<f:textarea path="address_register" type="text" class="form-control inputone" required="true" placeholder="Address"></f:textarea>
<f:checkbox path="" value="Remember Me"  label="I agree the terms and conditions"/>
<f:button type="submit" class="btn btn-lg btn-success btn-block button">Permit</f:button>
</f:form>

</div>
</div>
</div>
</div>
</body>
</html>