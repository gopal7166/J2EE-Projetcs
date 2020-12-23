<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="com.info.model.*,java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>Name</th>
<th>Roll</th>
<th>Email</th>
<th>Mobile</th>
<th>Pass</th>
</tr>

<%
ArrayList<Student> stu=(ArrayList<Student>)session.getAttribute("empDB");
for(Student st:stu)
{
%>
<tr>
<td><%=st.getName() %></td>
<td><%=st.getRoll() %></td>
<td><%=st.getEmail() %></td>
<td><%=st.getMobile() %></td>
<td><%=st.getPass() %></td>
</tr>
<%
}
%>
</table>
</body>
</html>