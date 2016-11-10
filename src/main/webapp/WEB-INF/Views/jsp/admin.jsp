<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Admin_header.jsp"></jsp:include>
<c:choose>
<c:when test="${categoryrequest==true}">
<jsp:include page="category.jsp"></jsp:include>
</c:when>
<c:when test="${supplierrequest==true}">
<jsp:include page="supplier.jsp"></jsp:include>
</c:when>
<c:when test="${productrequest==true}">
<jsp:include page="product.jsp"></jsp:include>
</c:when>
<c:otherwise>
<br>
<br>
<jsp:include page="admin_home.jsp"></jsp:include>
</c:otherwise>

</c:choose>




</body>
</html>