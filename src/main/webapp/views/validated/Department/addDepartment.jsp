<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Department</title>
</head>
<body>
	<%@ include file="../../includes/sidebar.jsp" %>
<h1>Add Department</h1>
	<form action="<%= request.getContextPath() %>/addDepartment" method="post">
		<input type="text" name="departmentName" placeholder="Department Name" />
		<button type="submit">Add</button>
	</form>
</body>
</html>