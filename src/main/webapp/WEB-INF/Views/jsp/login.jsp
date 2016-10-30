<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
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

</style>
</head>
<body >
<div class="container">
<div class="row vertical-offset-100">
<div class="col-md-3 col-md-offset-8">
<div class="form-group">
<img src="images/bag.png"/ class="logo"  class="img-responsive">

<f:form action="loginrequest" method="POST" modelAttribute="login">
<f:input path="email_id" type="text" class="form-control" placeholder="Email Id"></f:input>
<br>
<f:input path="password_login" type="password" class="form-control"  placeholder="Password"></f:input>
<br>
<f:checkbox path="" value="Remember Me"  label="Remember Me"/>

<f:button type="submit" class="btn btn-lg btn-success btn-block">submit</f:button>
</f:form>
</div>
</div>
</div>
</div>

</body>
</html>