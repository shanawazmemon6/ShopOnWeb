<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ShopOnWeb</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<link rel="stylesheet" href="css/loginstyle.css" />
<style>
body {
	background: url("images/bluredimg.jpg") no-repeat fixed top center;
}
</style>
<script>
	$(function() {

		$('#hiderow').fadeIn(2000);
		$('#hideout').fadeOut(1000);

	});
</script>
</head>
<body>
	<div class="container">
		<div class="pad">
			<img src="images/trans.png" id="hideout">

			<div class="row vertical-offset-100">
				<div class="col-sm-3 col-sm-offset-8">
					<div class="form-group" id="hiderow">
						<img src="images/bag.png" class="logo" class="img-responsive">

						<f:form action="loginrequest" method="POST" modelAttribute="login">
							<f:input path="email_id" type="email" class="form-control input1"
								placeholder="Email Id" required="true"></f:input>
							<f:input path="password_login" type="password"
								class="form-control input2" required="true"
								placeholder="Password"></f:input>
							<f:checkbox path="" value="Remember Me" label="Remember Me" />
							<f:button type="submit"
								class="btn btn-lg btn-success btn-block button">Login</f:button>
						</f:form> 

					</div> <!-- form-group -->
				</div> <!-- col-sm -->
			</div> <!-- row -->
		</div> <!-- pad -->
	</div> <!-- container -->
	<script>
		
</script>
</body>
</html>