<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpServlet, javax.servlet.http.HttpServletResponse" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- <link rel="stylesheet" href="<%= request.getContextPath() %>/styles/form/login.css" />  -->
<!--  <link rel="stylesheet" href="<%= request.getContextPath() %>/styles/views/general.css" /> -->
<title>Login</title>
</head>
<body>
  <div class="login-container">
        <img src="<%= request.getContextPath() %>/images/laptop-login.svg" alt="">
        <form action="<%= request.getContextPath() %>/adminValidation" id="login-form" class="login-form" method="post">
          <h1>Login</h1>
          <input type="text" placeholder="Email" name="email" />
         <input type="password" placeholder="Password" name="password" />
          <p class="error-message" style="color: red;">${error}<p>
          <button type="submit" class="login-submit-btn">Log In</button>
          <a href="#">Forget your password</a>
        </form>
  </div>
</body>
</html>