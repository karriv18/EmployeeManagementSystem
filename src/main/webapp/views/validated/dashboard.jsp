<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page import="com.ems.dao.WorkerDao,com.ems.model.*, java.util.*" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      rel="stylesheet"
      type="text/css"
      href="../../styles/views/general.css"
    />
    <link
      rel="stylesheet"
      type="text/css"
      href="../../styles/views/dashboard.css"
    />
    <title>Dashboard</title>
  </head>
  <body>
    <%@ include file="../includes/sidebar.html" %>
    <main class="main">
      <div class="main-admin">
        <h1>Hello, ${email}</h1>
      </div>
      <div class="main-content">
        <h1>Employees</h1>
        <div class="employees">
          
          <div class="card Total-Employees">
            <h2>Total Employees</h2>
            <h2 class="employee-count">0</h2>
          </div>
          <div class="card Total-Admins">
            <h2>Total Admins</h2>
            <h2 class="admin-count">0</h2>
          </div>
          <div class="card Total-Department">
            <h2>Total Department</h2>
            <h2 class="department-count">0</h2>
          </div>
          <div class="card Terminated-Employees">
            <h2>Terminated Employees</h2>
            <h2 class="terminated-count">0</h2>
          </div>
        </div>
        
        <h1>Task</h1>
        <div class="task">
          <div class="card Total-Task">
            <h2>Total Task</h2>
            <h2 class="task-count">0</h2>
          </div>
          <div class="card Done-Task">
            <h2>Done Task</h2>
            <h2 class="done-task-count">0</h2>
          </div>
          <div class="card Pending-Task">
            <h2>Pending Task</h2>
            <h2 class="pending-task-count">0</h2>
          </div>
        </div>

      </div>
    </main>
  </body>
  <script src="../../action/action.js"></script>
</html>
