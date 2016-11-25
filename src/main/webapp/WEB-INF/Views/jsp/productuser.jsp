<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="h" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Product</title>

<style>
#panel{
	box-shadow: 2px 2px 5px #000;
	margin-top:10px;
	

}



#stock{

margin-top:5px;


}
#butt_group{
padding:10px;
}


#panel_body {
  position: relative;
  overflow: hidden;
     height: 200px;
     
  
}
* {
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}

 #pro_img {
   max-width: 100%;
 
  -moz-transition: all 0.3s;
  -webkit-transition: all 0.3s;
  transition: all 0.3s;
}
#panel_body > a>img:hover{
  -moz-transform: scale(1.1);
  -webkit-transform: scale(1.1);
  transform: scale(1.1);
/*      -webkit-filter: blur(2px);
 */    -webkit-filter: grayscale(40%); 
  
}
.body_panel{
margin-top: 10px;
}
.filter_panel{
margin-top: 10px;

}
</style>

</head>
<body >
<div class="container-fluid" >

<div class="col-sm-2">
<div class="panel panel-default filter_panel">
<div class="panel-header text-center">
<h3>Filter</h3>
</div> <!-- filter_header -->
</div> <!-- filter_panel -->
</div>
<div class="col-sm-10">
<div class="panel panel-default body_panel">
<div class="panel-header text-center">
<h3>Mens</h3>
</div>
<div class="panel-body">
<h:forEach  items="${prolist}" var="pro">
<div class="col-sm-3">
<div class="panel panel-default" id="panel" >
  <div class="panel-body" id="panel_body"><a href="product_display?product_id=${pro.pro_id}"><img id="pro_img" class="img-responsive" alt="img" src="pro_images/${pro.pro_id}.jpg"></a></div>
  <div class="panel-footer text-center" ><b>${pro.pro_name}</b><br>
  <div style="margin-top:5px;"> <b style="color:red;">Rs.${pro.pro_price}</b></div>
    <div style="margin-top:5px;"><a class="btn btn-danger btn-block"><i class="fa fa-money" aria-hidden="true"></i> BUY</a>  </div>
    <div style="margin-top:5px;"><a class="btn btn-success btn-block"><i class="fa fa-shopping-cart fa-lg" aria-hidden="true"></i> ADD TO CART</a></div>
  
  
  </div>
</div>
</div>
</h:forEach>
</div> <!-- body panel -->
</div> <!-- body_panel -->
</div>
</div> <!-- col-sm -->
</body>
</html>