<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>home</title>
	</head>
	<body>
	
		<%!
			public void jspInit()
			{
				System.out.println(" jspInit method called to load the JSP!!!");
			}
			public void jspDestroy()
			{
				System.out.println("Jsp has been destroyed!!!!!");
			}		
		
		%>
	
		<%
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			System.out.println("Request has been handled!!!!!");
			
			if("Abhay".equalsIgnoreCase(username) && "abhay123".equals(password))
			{
		%>
				<h1>Welcome!!!!!!!!! Mr. <%=username %></h1>
		<%		
			}	
			else
			{
		%>
				<h1>Not a valid user!!!!</h1>
		<%	
			}	
		%>
		
	
	</body>
</html>