
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="g"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>


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

						<g:form action="loginrequest" method="POST" modelAttribute="login">
							<g:input path="email_id" type="email" class="form-control input1"
								placeholder="Email Id" required="true"></g:input>
							<g:input path="password_login" type="password"
								class="form-control input2" required="true"
								placeholder="Password"></g:input>
							<g:checkbox path="" value="Remember Me" label="Remember Me" />
							<g:button type="submit"
								class="btn btn-lg btn-success btn-block button">Login</g:button>
						</g:form>

					</div>
					<!-- form-group -->
				</div>
				<!-- col-sm -->
			</div>
			<!-- row -->
		</div>
		<!-- pad -->
	</div>
	<!-- container -->
	<script>
		
	</script>
</body>
</html>