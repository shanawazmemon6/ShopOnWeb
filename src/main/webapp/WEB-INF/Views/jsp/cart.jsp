<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="m"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart</title>

</head>
<body>
<div class="container">
<div class="panel panel-default" style="margin-top:40px;">
<div class="panel-heading">
<h4>Cart</h4>
</div>
<div class="panel-body">
<table class="table table-bordered table-hover" >
 <thead>
 
      <tr >
        <th class="text-center" style="padding:20px">Product</th>
        <th class="text-center" style="padding:20px">Quantity</th>
          <th class="text-center" style="padding:20px">Date</th>
            <th class="text-center" style="padding:20px" >Price</th>
                        <th class="text-center" style="padding:20px" >Delete</th>
            
         
         
        
      </tr>
    </thead>
<m:forEach items="${cart_list}" var="car">
  
   
    <tbody>
      <tr>
        
        <td class="text-center"><img width="30px" height="60px" src="pro_images/${car.pro_id}.jpg"><span style="margin-left: 50px;">
        <b >${car.pro_name}</b></span></td>
        <td class="text-center"> <div class="col-sm-4 col-sm-offset-4 " style="margin-top:20px;">
        <form action="quantity" method="get">
         <input type="number" min="1"  value="${car.quantity}" class="form-control disable text-center"/>
         <a class="btn btn-warning" style="margin-top:5px;" type="submit">Update</a>
        </form>
        </div></td>
        <td class="text-center"><div style="margin-top:20px;">${car.date_cart}</div></td>
           <td class="text-center"><div style="margin-top:20px;">${car.price}</div></td>
           <td class="text-center"><a href="delete_cart?cart_id=${car.cart_id}"  class="btn btn-danger" style="margin-top:20px;" type="submit">Delete</a></td>
      </tr>
     
    </tbody>
    </m:forEach>
    
  </table>
  </div>
  
  <div class="panel-footer">
  
 <h6>@ShopOnWeb</h6>

<div class="pull-right" style="position:relative; top:-30px;"> <a  class="btn btn-success ">Proceed</a></div>

<div class="pull-left" style="position:relative; top:-30px; "> <a  class="btn btn-danger ">Continue Shopping</a></div>


 
  </div>
</div>
</div>

</body>
</html>