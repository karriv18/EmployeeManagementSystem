<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="javax.servlet.http.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.ems.model.EmployeeModel" %>
<%@ page import="com.ems.model.WorkerModel" %>
<%@ page import="com.ems.dao.EmployeeDao" %>
<%
	String id = request.getParameter("id");
	EmployeeModel em = new EmployeeModel();
	EmployeeDao ed = new EmployeeDao();
	em = ed.getEmployeeById(Integer.parseInt(id));
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Employee</title>
</head>
<body>
	<%@ include file="../includes/sidebar.html" %>
	<h1>Update Employee</h1>
	<table>
		<thead>
			<tr>
				<th>Firstname</th>
				<th>Middlename</th>
				<th>Lastname</th>
				<th>Email</th>
				<th>Department</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<tr>
			<form action="<%= request.getContextPath()%>/editEmployee" method="get">
				<input type="hidden" value="<%= em.getId() %>"   name="id"/>
				<td><input type="text" value="<%= em.getFirstName() %>"  name="firstName"/></td>
				<td><input type="text" value="<%= em.getMiddleName() %>" name="middleName"/></td>
				<td><input type="text" value="<%= em.getLastName() %>"   name="lastName"/></td>
				<td><input type="text" value="<%= em.getEmail() %>"      name="email"/></td>
				<td><input type="text" value="<%= em.getDepartment() %>" name="department" /></td>
				<td><button type="submit">Update</button></td>
			</form>
			</tr>
		</tbody>
	</table>
</body>
</html>