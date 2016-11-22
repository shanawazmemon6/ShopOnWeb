
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>

<title>Product</title>
<script>

var prod_list=${prolist};
alert(prod_list);
angular.module('product_app_user',[]).controller('product_ctrl_user',function($scope){

	$scope.product=prod_list;


	
});


</script>
<style>
.panel{
	box-shadow: 5px 5px 15px #000;
	margin-top:50px;

}

</style>
</head>
<body ng-app="product_app_user" ng-controller="product_ctrl_user">
<div class="container">
<div class="col-sm-3" ng-repeat="pro in product">
<div class="panel panel-default">
  <div class="panel-body"><img class="img-responsive" alt="img" src="https://placeholdit.imgix.net/~text?txtsize=28&txt=300%C3%97300&w=300&h=300"></div>
  <div class="panel-footer">{{pro.pro_name}}</div>
</div>
</div>
</div>
</body>
</html>