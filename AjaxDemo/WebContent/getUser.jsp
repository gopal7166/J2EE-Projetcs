<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>get User</title>
	</head>
	
	<body>
		
		<%
			String username = request.getParameter("username");
			if(username.length() > 0)
			{
				boolean flag = false;
				String url = "jdbc:mysql://localhost:3306/abhay";
				String user = "root";
				String password = "gillabhay";
				try
				{			
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url, user, password);

					String query = "select name from student where name like ?";
					PreparedStatement ps = con.prepareStatement(query);
					ps.setString(1, username+"%");	
					
					ResultSet rs = ps.executeQuery();
					
					while(rs.next())
					{
						flag = true;
						out.println(rs.getString(1)+"<br>");
					}					
					
				}
				catch(Exception e)
				{
					System.out.println("Error is : "+e);
				}			
				if(!flag)
				{
					out.println("No result found!");
				}
				
			}
			else
			{
				out.println("");
			}
		
		
		%>
		
		
	</body>
</html>