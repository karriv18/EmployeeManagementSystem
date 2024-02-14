<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page import="com.ems.dao.*" %>
<%@ page import="com.ems.model.*" %>
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>
</head>
<body>
	<%@ include file="../includes/sidebar.jsp" %>
	    <form action="<%= request.getContextPath() %>/employeeServlet" method="post">
    	<h1>Add Employee</h1>
    	<input type="text" placeholder="First Name" name="firstName"/><br />
    	<input type="text" placeholder="Middle Name" name="middleName" /><br />
    	<input type="text" placeholder="Last Name" name="lastName"/><br />
		<input type="email" placeholder="Email" name="email" /><br />
    	<input type="text" placeholder="Dapartment" name="department" /><br />
    	<button type="submit">Add Employee</button><br />
    </form>
</body>
</html>