<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
 <img alt="brand" src="images/bag.png" class=brand style="width:10%">
  <ul class="nav nav-tabs">
   
    <li class="active"><a data-toggle="tab" href="#category">Category</a></li>
    <li><a data-toggle="tab" href="#menu2">Supplier</a></li>
    <li><a data-toggle="tab" href="#menu3">Product</a></li>
  </ul>

  <div class="tab-content">
    
    <div id="category" class="tab-pane fade in active">
    
    
    <div class="col-sm-4 col-sm-offset-4 text-center row">
    <h1>Category</h1>
      <f:form action="adminrequest" method="post" modelAttribute="cate"> 
      
      <f:input path="cate_id" placeholder="Category Id" class="form-control inputone"/>
      <f:input path="cate_name"  placeholder="Category Name" class="form-control inputone"/>
      <f:input path="cate_desc"  placeholder="Category Description" class="form-control  inputtwo"/>
      <f:button type="submit" class="btn btn-success btn-block button" >Submit</f:button>
     <f:button type="reset" class="btn btn-warning btn-block" >Clear</f:button>
      
      
      
      
      
      
      </f:form>
      </div>
  
    </div>
    <div id="menu2" class="tab-pane fade">
      <div id="category" class="tab-pane fade in active">
    <div class="col-sm-4 col-sm-offset-4 text-center row">
    <h1>Supplier</h1>
      <f:form action="adminrequest" method="post" modelAttribute="sup"> 
    <f:input path="sup_id" placeholder="Supplier Id" class="form-control inputone"/>
      <f:input path="sup_name"  placeholder="Supplier Name" class="form-control inputone"/>
     <f:input path="sup_address"  placeholder="Supplier Address" class="form-control  inputtwo"/>
      <f:input path="sup_number"  placeholder="Supplier Number" class="form-control inputone"/>
      <f:input path="sup_email"  placeholder="Supplier Email" class="form-control inputone"/>
      
      <f:button type="submit" class="btn btn-success btn-block button" >Submit</f:button>
     <f:button type="reset" class="btn btn-warning btn-block" >Clear</f:button>
     </f:form>
      </div>
    </div>
    <div id="menu3" class="tab-pane fade">
      <h3>Menu 3</h3>
      <p>Eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>
    </div>
  </div>
</div>
</body>
</html>