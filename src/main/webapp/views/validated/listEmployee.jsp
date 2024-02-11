<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page import="com.ems.dao.*" %>
<%@ page import="com.ems.model.*" %>
<%@ page import="java.util.*" %>
<%
	WorkerDao wd = new WorkerDao();
	List <WorkerModel> employeeList = wd.getAllEmployees();
	String name = "karl";
	int i = 0; 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
</head>
<body>
	<%@ include file="../includes/sidebar.html" %>
	<table>
		<h1>Employee List</h1>
		<thead>
		<tr>
			<th>Id</th>
			<th>Firstname</th>
			<th>Middlename</th>
	        <th>Lastname</th>
			<th>Email</th>
	        <th>Department</th>
	        <th>Actions</th>
		</tr>
		</thead>
		<% for(; i < employeeList.size(); i++){ %>
		<% int id = employeeList.get(i).getId(); %>
		
		<tr>
			<td><%= employeeList.get(i).getId() %> </td>
			<td><%= employeeList.get(i).getFirstName()%></td>
			<td><%= employeeList.get(i).getMiddleName() %></td>
			<td><%= employeeList.get(i).getLastName() %></td>
			<td><%= employeeList.get(i).getEmail() %></td>
			<td><%= employeeList.get(i).getDepartment() %></td>
			<td>
				<a href="editEmployee.jsp?id=<%= employeeList.get(i).getId()%>">Edit</a>
				<form action="<%= request.getContextPath() %>/deleteEmployee" method="post">
					<input type="hidden" name="id" value="<%= id %>" /> 
					<input type="hidden" name="firstName" value="<%=  employeeList.get(i).getFirstName() %>" />
					<input type="hidden" name="middleName" value="<%=  employeeList.get(i).getMiddleName() %>" />
					<input type="hidden" name="lastName" value="<%=  employeeList.get(i).getLastName() %>" />
					<input type="hidden" name="email" value="<%= employeeList.get(i).getEmail() %>" />
					<input type="hidden" name="department" value="<%=  employeeList.get(i).getDepartment() %>" />
					<button type="submit">Delete</button>
				</form>
			</td>
		</tr>
		<% } %>

	</table>
</body>
<script src="../../action/action.js"></script>
</html>