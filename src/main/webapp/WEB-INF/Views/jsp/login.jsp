<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style >
.center_div{
    margin: 0 auto;
    width:80% /* value of your choice which suits your alignment */
}
</style>
</head>
<body>
<div class="container center_div" >

<form action="loginrequest" method="POST" role="form" class="form-horizontal">
<div class="form-group">
  <label for="usr">Name:</label>
  <input type="text" class="form-control" name="email_id">
</div>
<div class="form-group">
  <label for="pwd">Password:</label>
  <input type="password" class="form-control" name="password_login">
</div>

<div class="form-group">
   
      <button type="submit" class="btn btn-default">submit</button>
    </div>

</form>
</div>

</body>
</html>