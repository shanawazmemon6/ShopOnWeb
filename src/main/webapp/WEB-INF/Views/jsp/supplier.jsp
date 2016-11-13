<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="a"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Supplier</title>
<link rel="stylesheet" href="css/supplier.css" />

</head>
<body>

	<div class="container">
		<div class="col-sm-4 col-sm-offset-4 text-center row">
			<h1>Supplier</h1>
			${message}
			<a:form action="supplierrequestpost" method="post"
				modelAttribute="sup"
				onsubmit="this.submit(); this.reset(); return false;">
				<a:input path="sup_id" placeholder="Supplier Id"
					class="form-control inputone" />
				<a:input path="sup_name" placeholder="Supplier Name"
					class="form-control inputone" />
				<a:input path="sup_address" placeholder="Supplier Address"
					class="form-control  inputtwo" />
				<a:input path="sup_number" placeholder="Supplier Number"
					class="form-control inputone" />
				<a:input path="sup_email" placeholder="Supplier Email"
					class="form-control inputone" />
				<a:button type="submit" class="btn btn-success btn-block button">Submit</a:button>
				<a class="btn btn-warning btn-block" href="supplierrequest">Clear</a>
			</a:form>
		</div> <!-- col-sm -->
	</div> <!-- container -->
</body>
</html>