
<%@page import="org.apache.taglibs.standard.tag.common.xml.ForEachTag"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>


<head>

	
	

<style>
.hello {
	margin-top: 10px;
	color: #008000;
	background-color: #ffffff;
	display: none;
}
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

	
<script>

	$(function() {

		$('.hello').slideDown();
		if($('.addto').hover){
$('.cart_img').attr('style','position: fixed; top:-100px; left:1200px; background-color:#ffffff;	box-shadow: 5px 5px 15px #000;')
		}
		

		
	});
	$(function(){
		$('.addto').hover(function(){
			var st=$('.cart_img').animate({top:"60px"});
		},function(){
			var st=$('.cart_img').animate({top:"-100px"});

		});
		
		if($('.addto').click){
			$('.cart_img').attr('style','position: fixed; top:60px; left:1200px; background-color:#ffffff;	box-shadow: 5px 5px 15px #000;')
					}
			
	});
	


	
</script>

</head>
<body  >



   <jsp:include page="header.jsp"></jsp:include>	
   		
	<c:choose>
	
	<c:when test="${ProductUserRequest==true}">
	
			<jsp:include page="productuser.jsp"></jsp:include>

		</c:when>
		<c:when test="${cart==true}">
	
			<jsp:include page="cart.jsp"></jsp:include>

		</c:when>
			<c:when test="${error==true}">
	
			<jsp:include page="error.jsp"></jsp:include>

		</c:when>
		<c:when test="${ProductRequestDisplay==true}">
	
			<jsp:include page="productDisplay.jsp"></jsp:include>

		</c:when>
		
		
		<c:when test="${LoginRequest==true}">
			<div class="container">
				<c:if test="${entry==true}">
					<div class="col-sm-4 col-sm-offset-4">
						<div class="alert hello text-center">
							<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
							<strong>${message}</strong>
						</div>
						<!-- alert -->
					</div>
					<!-- col-sm -->

				</c:if>
			</div>
			<!-- container -->

			<jsp:include page="login.jsp"></jsp:include>



		</c:when>
		<c:when test="${RegisterRequest==true}">
			<div class="container">
				<c:if test="${entry==true}">
					<div class="col-sm-4 col-sm-offset-4">
						<div class="alert hello text-center">
							<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
							<strong>${message}</strong>
						</div>
						<!-- alert -->
					</div>
					<!-- col-sm -->
				</c:if>
			</div>
			<!-- container -->
			<jsp:include page="register.jsp"></jsp:include>

       
		</c:when>
	
		<c:when test="${ContactRequest==true}">

			<jsp:include page="contact.jsp"></jsp:include>


		</c:when>
		<c:when test="${AboutRequest==true}">

			<jsp:include page="about.jsp"></jsp:include>


		</c:when>
	
		
		<c:when test="${LaunchRequest==true}">
			<div class="container">
				<c:if test="${loggedin==true}">
					<div class="col-sm-4 col-sm-offset-4">
						<div class="alert hello text-center">
							<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
							<strong>${role}</strong>
						</div>
						<!-- alert -->
					</div>
					<!-- col-sm -->
				</c:if>
			</div>
			<!-- container -->

			<br>
			<br>
			<jsp:include page="launch.jsp"></jsp:include>
		</c:when>
		<c:otherwise>
			<br>
			<br>
			<jsp:include page="launch.jsp"></jsp:include>
		</c:otherwise>

	</c:choose>
	<div style="background-color: #fff; width:550px; top:220px; border:rounded; left:450px;  position:absolute; display: none;"    class="list-group dropitdown">
				<a ng-repeat="pro in product|filter:search" href="product_display?product_id={{pro.pro_id}}" class="list-group-item"><img width="30px" height="60px" src="pro_images/{{pro.pro_id}}.jpg"><span style="margin-left: 50px;"><b>{{pro.pro_name}}</b></span></a>
				
				</div>
	<br>
	<br>
	<a href="#" ><img width="80px" height="80px" class="img-circle cart_img" alt="cart" src="images/cart.png"></a>
 	<jsp:include page="footer.jsp"></jsp:include> 
 

</body>
</html>
