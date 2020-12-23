<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="s" uri="/struts-tags" %>   
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Login Form</title>
	</head>
	
	<body style="margin:0px;">

	
		<h1 style="margin-left:350px; margin-top:50px; font-family:lucida sans unicode;">Struts2 Check!!!</h1>
		<hr>
			<s:form action="login.action">
				<s:textfield label="Enter username" key="username" />
				<s:password label="Enter Password" key="password" />
				<s:submit value="Login" />
			</s:form>
		<br><br><br>
		<hr>
	</body>
</html>