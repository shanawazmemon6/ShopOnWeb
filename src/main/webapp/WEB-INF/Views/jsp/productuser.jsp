<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="h" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Product</title>

<style>
.panel{
	box-shadow: 2px 2px 5px #000;
	margin-top:50px;
	

}



#stock{

margin-top:5px;


}
#butt_group{
padding:10px;
}
* {
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}

.panel-body {
  position: relative;
  
  overflow: hidden;
}
 img {
  max-width: 100%;
  
  -moz-transition: all 0.3s;
  -webkit-transition: all 0.3s;
  transition: all 0.3s;
}
.panel-body > a>img:hover{
  -moz-transform: scale(1.1);
  -webkit-transform: scale(1.1);
  transform: scale(1.1);
/*     -webkit-filter: blur(2px);
 */    -webkit-filter: grayscale(40%);
  
}

</style>

</head>
<body >
<div class="container-fluid" >
<h:forEach  items="${prolist }" var="pro">
<div class="col-sm-2">
<div class="panel panel-default" >
  <div class="panel-body"><a href="#"><img class="img-responsive" alt="img" src="http://static4.shop.indiatimes.com/images/products/additional/original/B3423710_View_1/fashion/shirts/top-notch-black-men-shirts-rcdsh-a.jpg"></a></div>
  <div class="panel-footer text-center" ><b>${pro.pro_name}</b><br>
  <div style="margin-top:5px;"> <b style="color:red;">Rs.${pro.pro_price}</b></div>
    <div style="margin-top:5px;"><a class="btn btn-danger btn-block"><i class="fa fa-money" aria-hidden="true"></i> BUY</a>  </div>
    <div style="margin-top:5px;"><a class="btn btn-success btn-block"><i class="fa fa-shopping-cart fa-lg" aria-hidden="true"></i> ADD TO CART</a></div>
  
  
  </div>
</div>
</div>
</h:forEach>
</div>
</body>
</html>