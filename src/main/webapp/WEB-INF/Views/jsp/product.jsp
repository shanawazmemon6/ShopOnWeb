<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="a"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<title>Product</title>
<link rel="stylesheet" href="css/product.css"/>
<script>
var cate_list=${cate_list};
var sup_list=${sup_list};
var prod_list=${prod_list};


angular.module('product_app',[]).controller('product_ctrl',function($scope){
	$scope.category=cate_list;
	$scope.suplier=sup_list;
	$scope.product=prod_list;


	
});


</script>
<style>
.row_prod {
	margin-top: 50px;
	padding: 20px;
	box-shadow: 5px 5px 15px #000;
}
.panel-heading {
padding:5px;
}
#del {
    position: relative;
    top: -15px;
    width:10%;
    
} 
#edit{
    position: relative;
    top: -15px;
    width:10%;
    right:20px;
} 
.panel-title{
    position: relative;

 top:10px;
 left:5px;
}


</style>
</head>
<body>

	<div class="container" ng-app="product_app" ng-controller="product_ctrl" >
	<c:if test="${edit==true}">
		<div class="col-sm-3 text-center row_prod" >
			<h1>Product</h1>
			${message}
			<a:form action="productrequestpost" method="post"
				modelAttribute="prod">
				<a:input path="pro_id" placeholder="Product Id"
					class="form-control " style="margin-top:10px"/>
				<a:input path="pro_name" placeholder="Product Name"
					class="form-control " style="margin-top:10px"/>
				<a:input path="pro_price" placeholder="Product Price"
					class="form-control" style="margin-top:10px" />
				<a:select path="pro_cate_id" class="form-control" style="margin-top:10px"> 
				<a:option value="-1">Select Category Name</a:option>
					<a:option ng-repeat="cat in category" value="{{cat.cate_id}}">{{cat.cate_name}}</a:option>
									</a:select>
			<a:select path="pro_sup_id" class="form-control" style="margin-top:10px"> 
				<a:option value="-1">Select Supplier Name</a:option>
					<a:option ng-repeat="sup in suplier" value="{{sup.sup_id}}">{{sup.sup_name}}</a:option>
									</a:select>
				
				<a:input path="pro_desc" placeholder="Product Description" style="margin-top:10px"
					class="form-control " />
				<a:input path="pro_stock" placeholder="Product Stock"
					class="form-control " style="margin-top:10px"/>
				<a:button type="submit" class="btn btn-success btn-block button">Submit</a:button>
				<a class="btn btn-warning btn-block" href="productrequest">Clear</a>
			</a:form>
		</div> <!-- col-sm -->
		</c:if> <!-- save -->
			<c:if test="${udate==true}">
		<div class="col-sm-3 text-center row_prod" >
			<h1>Product</h1>
			${message}
			<a:form action="updaterequestpost" method="post"
				modelAttribute="prod">
				<a:input path="pro_id" placeholder="Product Id"
					class="form-control " style="margin-top:10px"/>
				<a:input path="pro_name" placeholder="Product Name"
					class="form-control " style="margin-top:10px"/>
				<a:input path="pro_price" placeholder="Product Price"
					class="form-control" style="margin-top:10px" />
				<a:select path="pro_cate_id" class="form-control" style="margin-top:10px"> 
				<a:option value="-1">Select Category Name</a:option>
					<a:option ng-repeat="cat in category" value="{{cat.cate_id}}">{{cat.cate_name}}</a:option>
									</a:select>
			<a:select path="pro_sup_id" class="form-control" style="margin-top:10px"> 
				<a:option value="-1">Select Supplier Name</a:option>
					<a:option ng-repeat="sup in suplier" value="{{sup.sup_id}}">{{sup.sup_name}}</a:option>
									</a:select>
				
				<a:input path="pro_desc" placeholder="Product Description" style="margin-top:10px"
					class="form-control " />
				<a:input path="pro_stock" placeholder="Product Stock"
					class="form-control " style="margin-top:10px"/>
				<a:button type="submit" class="btn btn-success btn-block button">Update</a:button>
				<a class="btn btn-warning btn-block" href="productrequest">Clear</a>
			</a:form>
		</div> <!-- col-sm -->
		</c:if> <!-- udate -->
		<div class="col-sm-8 col-sm-offset-1 row_prod">
		<div class="row" ng-repeat="prod in product">
		  <div class="panel-group" id="accordion">
     <div class="panel panel-default">
    <div class="panel-heading">
      <h4 class="panel-title" >
        <a data-toggle="collapse" data-parent="#accordion" href="#{{prod.pro_id}}"><b>{{prod.pro_name}}</b></a>
        
   </h4>
     
   
   <a class="btn btn-danger pull-right" id="del" href="delete?pid={{prod.pro_id}}">Delete</a>&nbsp;
    <a class="btn btn-primary pull-right" id="edit" href="update?pid={{prod.pro_id}}">Edit</a>
   
  
   </div>
   <div id={{prod.pro_id}} class="panel-collapse collapse ">
    <div class="panel-body">
    
    <ul class="list-group">
  <li class="list-group-item"><span><b>Product Id:</b></span>&nbsp;&nbsp;{{prod.pro_id}}</li>
  <li class="list-group-item"><b>Product Price:</b>&nbsp;&nbsp;{{prod.pro_price}}</li>
  <li class="list-group-item"><b>Product Category Id:</b>&nbsp;&nbsp;{{prod.pro_cate_id}}</li>
    <li class="list-group-item"><b>Product Supplier Id:</b>&nbsp;&nbsp;{{prod.pro_sup_id}}</li>
  
    <li class="list-group-item"><b>Product Description:</b>&nbsp;&nbsp;{{prod.pro_desc}}</li>
    <li class="list-group-item"><b>Product Stock:</b>&nbsp;&nbsp;{{prod.pro_stock}}</li>
  
</ul>
   </div>
   </div>
   </div>
   </div> <!-- panel group -->
  
  </div> <!-- row -->

		</div> <!-- col-sm -->
	</div> <!-- container -->
</body>
</html>