<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.ems.dao.DepartmentDao" %>
<%@ page import="com.ems.model.DepartmentModel" %>
<%@	page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<% 
	DepartmentDao dd = new DepartmentDao();
	List<DepartmentModel> ldm = dd.getAllDepartment();
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Departments</title>
</head>
<body>
	<%@ include file="../../includes/sidebar.jsp" %>
	<table>
	<h1>Department List</h1>
		<thead>
			<tr>
				<th>ID</th>
				<th>Department</th>
				<th>Date Added</th>
				<th>Personnel</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
		<% for(int i = 0; i < ldm.size(); i++) {%>
			<tr>
				<td><%= ldm.get(i).getId()%></td>
				<td><%= ldm.get(i).getName()%></td>
				<td></td>
				<td></td>
				<td>
					<button>Edit</button>
					<button>Delete</button>
				</td>
			</tr>
		<% } %>
		</tbody>
	</table>
	<a href="addDepartment.jsp">Add Department</a>
</body>
</html>