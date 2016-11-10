<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.row{

margin-top:100px;
  margin-bottom:100px;
  padding:50px;
	box-shadow: 5px 5px 15px #000;

}
.inputone{
padding: 20px;
	margin-top: 10px;
}
.inputtwo{
padding:20px;
margin-top:10px;
margin-bottom:10px;


}
.button{
margin-top:10px;
margin-bottom:10px;
}

</style>
</head>
<body>
 <div class="col-sm-4 col-sm-offset-4 text-center row">
    <h1>Category</h1>
      ${message}
      <f:form action="categoryrequestpost" method="post" modelAttribute="cate"> 
      
      <f:input path="cate_id" placeholder="Category Id" class="form-control inputone"/>
      <f:input path="cate_name"  placeholder="Category Name" class="form-control inputone"/>
      <f:input path="cate_desc"  placeholder="Category Description" class="form-control  inputtwo"/>
      <f:button type="submit" class="btn btn-success btn-block button" >Submit</f:button>
     <f:button type="reset" class="btn btn-warning btn-block" >Clear</f:button>
      
      
      
      
      
      
      </f:form>
      </div>
</body>
</html>