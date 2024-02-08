<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page import="com.ems.dao.*" %>
<%@ page import="com.ems.model.*" %>
<%@ page import="java.util.*" %>
<%
	WorkerDao wd = new WorkerDao();
	List <WorkerModel> employeeList = wd.getAllEmployees();
	
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
		<% for(int i = 0; i < employeeList.size(); i++){ %>
		<tr>
			<td><%= employeeList.get(i).getId() %> </td>
			<td><%= employeeList.get(i).getFirstName()%></td>
			<td><%= employeeList.get(i).getMiddleName() %></td>
			<td><%= employeeList.get(i).getLastName() %></td>
			<td><%= employeeList.get(i).getEmail() %></td>
			<td><%= employeeList.get(i).getDepartment() %></td>
			<td>
				<a href="editEmployee.jsp?id=<%= employeeList.get(i).getId()%>">Edit</a>
			</td>
		</tr>
		<% } %>
	</table>
</body>
<script src="../../action/action.js"></script>
</html>