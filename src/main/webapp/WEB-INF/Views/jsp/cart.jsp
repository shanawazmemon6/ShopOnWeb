<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="m"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart</title>

</head>
<body>
<div class="container">

<table class="table table-hover" >
 <thead>
      <tr>
        <th>Product</th>
        <th>Quantity</th>
          <th>Date</th>
                  <th>price</th>
         
         
        
      </tr>
    </thead>
<m:forEach items="${cart_list}" var="car">
  
   
    <tbody>
      <tr>
        <td><img width="80px" height="140px" src="pro_images/${car.pro_id}.jpg"></td>
        <td>${car.quantity}</td>
        <td>${car.date_cart}</td>
                <td>${car.price}</td>
        
      </tr>
     
    </tbody>
    </m:forEach>
    
  </table>
</div>

</body>
</html>