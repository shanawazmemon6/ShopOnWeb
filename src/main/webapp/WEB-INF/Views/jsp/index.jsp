
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
<jsp:include page="header.jsp"></jsp:include>

<c:choose>
<c:when test="${LoginRequest==true}">

<jsp:include page="login.jsp"></jsp:include>


</c:when>
<c:when test="${RegisterRequest==true}">

<jsp:include page="register.jsp"></jsp:include>


</c:when>
<c:when test="${ContactRequest==true}">

<jsp:include page="contact.jsp"></jsp:include>


</c:when>
<c:when test="${AboutRequest==true}">

<jsp:include page="about.jsp"></jsp:include>


</c:when>
<c:when test="${LaunchRequest==true}">
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

<br>
<br>
<jsp:include page="footer.jsp"></jsp:include>


</body>
</html>
