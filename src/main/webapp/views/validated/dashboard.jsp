<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page import="com.ems.dao.WorkerDao,com.ems.model.*, java.util.*" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" type="text/css" href="../../styles/views/general.css" />
    <link rel="stylesheet" type="text/css" href="../../styles/views/dashboard.css" />
    <title>Dashboard</title>

  </head>
  <body>

    <%@ include file="../includes/sidebar.html" %>
    <main class="main">
      <div class="main-admin">
        <h1>Hello, ${email}, ${name}</h1>
      </div>
      <div class="main-content">
        <div class="employees">
          <h1>Employees</h1>
          <div class="Total-Employees">Total Employees</div>
          <div class="Total-Admins">Total Admins</div>
          <div class="Total-Department">Total Department</div>
          <div class="Terminated-Employees">Terminated Employees</div>
        </div>
		
        <div class="Task">
          <h1>Task</h1>
          <div class="Total-Task">Total Task</div>
          <div class="Done-Task">Done Task</div>
          <div class="Pending-Task">Pending Task</div>
        </div>
      </div>
    </main>


  </body>
</html>
