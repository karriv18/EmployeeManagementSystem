<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Admin</title>
</head>
<body>
	<%@ include file="../../includes/sidebar.jsp" %>
<h1>Add Admin</h1>
	<from action="" method="post">
		<input type="text" name="firstName" placeholder="First Name"/>
		<input type="text" name="middleName" placeholder="Middle Name"/>
		<input type="text" name="lastName" placeholder="Last Name" />
		<input type="date" name="birtDate" placeholder="Birth Date" />
	</from>
</body>
</html>