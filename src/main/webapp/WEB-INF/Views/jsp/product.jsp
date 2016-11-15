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



</style>
</head>
<body>
	<div class="container" ng-app="product_app" ng-controller="product_ctrl" >
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
		
		<div class="col-sm-8 col-sm-offset-1 row_prod">
		<table class="table table-bordered table-hover">
    <thead>
      <tr>
      <th>Product Id</th>
       <th>Product name</th>
<th>Product Description</th>
<th>Supplier Id</th>
<th>Category Id</th>
<th>Stock</th>
<th>Price</th>
      </tr>
    </thead>
     <tbody>
<tr  ng-repeat="prod in product">
                <td>{{prod.pro_id}}</td> 
                 <td>{{prod.pro_name}}</td>
                  <td>{{prod.pro_desc}}</td>
                  <td>{{prod.pro_sup_id}}</td>
                  <td> {{prod.pro_cate_id}}</td>
                  <td> {{prod.pro_stock}}</td>
                   <td> {{prod.pro_price}}</td>
                 
</tr>
 </tbody>
</table>
		</div> <!-- col-sm -->
	</div> <!-- container -->
</body>
</html>