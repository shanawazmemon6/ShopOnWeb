<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="a"%>
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

angular.module('product_app',[]).controller('product_ctrl',function($scope){
	$scope.category=cate_list;
	$scope.suplier=sup_list;

	
});


</script>
</head>
<body>
	<div class="container" ng-app="product_app" ng-controller="product_ctrl" >
		<div class="col-sm-4 col-sm-offset-4 text-center row" >
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
				<a class="btn btn-warning btn-block" href="supplierrequest">Clear</a>
			</a:form>
		</div> <!-- col-sm -->
	</div> <!-- container -->
</body>
</html>