<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="a" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style>
.row{

margin-top:100px;
  margin-bottom:100px;
  padding:50px;
	box-shadow: 5px 5px 15px #000;

}
.inputone{
padding: 20px;
	margin-top: 10px;
}
.inputtwo{
padding:20px;
margin-top:10px;
margin-bottom:10px;


}
.button{
margin-top:10px;
margin-bottom:10px;
}

</style>
</head>
<body>

<div class="container">
 <div class="col-sm-4 col-sm-offset-4 text-center row">
    <h1>Supplier</h1>
      <a:form action="supplierrequest" method="post" modelAttribute="sup"> 
    <a:input path="sup_id" placeholder="Supplier Id" class="form-control inputone"/>
      <a:input path="sup_name"  placeholder="Supplier Name" class="form-control inputone"/>
     <a:input path="sup_address"  placeholder="Supplier Address" class="form-control  inputtwo"/>
      <a:input path="sup_number"  placeholder="Supplier Number" class="form-control inputone"/>
      <a:input path="sup_email"  placeholder="Supplier Email" class="form-control inputone"/>
      <a:button type="submit" class="btn btn-success btn-block button" >Submit</a:button>
     <a:button type="reset" class="btn btn-warning btn-block" >Clear</a:button>
     </a:form>
      </div>
     </div>
</body>
</html>