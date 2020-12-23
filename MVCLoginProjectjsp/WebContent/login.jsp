<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.info.service.*"%>
<jsp:useBean id="obj" class="com.info.model.Employee"/>  
  
<jsp:setProperty property="*" name="obj"/>  
      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    
<%  

boolean status=EmployeeService.verifyEmployee(obj);  
if(status){    
request.setAttribute("username", obj.getUsername());
%>
<jsp:include page="hello.jsp"></jsp:include>
<% 
}  
else  
{
session.setAttribute("str", "Sorry, email or password error");  
%>  
<jsp:include page="Welcome.jsp"></jsp:include>  
<%  
}  
%>  


</body>
</html>