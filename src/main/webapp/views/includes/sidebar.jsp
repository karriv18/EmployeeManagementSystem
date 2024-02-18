<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

if (session.getAttribute("email") == null){
	response.sendRedirect("../../index.jsp");
}
%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!-- <link rel="stylesheet" href="../../styles/includes/sidebar.css" />
    <link rel="stylesheet" href="../../styles/views/general.css" />
    <link rel="stylesheet" href="../../styles/views/index.css" /> -->
    <!--<link rel="stylesheet" href="<%= request.getContextPath() %>/styles/views/dashboard.css" /> -->
    <!--<link rel="stylesheet" href="<%= request.getContextPath() %>/styles/views/general.css" /> -->
    <!-- <link rel="stylesheet" href="<%= request.getContextPath() %>/styles/includes/sidebar.css" /> -->
    <link
      rel="stylesheet"
      href="https://cdn-uicons.flaticon.com/2.1.0/uicons-regular-rounded/css/uicons-regular-rounded.css"
    />
    <title></title>
  </head>
  <body>
    <nav class="sidebar" id="sidebar">
      <div class="top-section" id="top-section">
        <div class="pic-container" id="pic-container">
          <img
            src=""
            alt=""
            class="profile-pic"
            id="profile-pic"
          />
        </div>
        <div class="name-container">
          <p class="name">Karl Clarence Rivera</p>
          <p class="email">karl@gmail.com</p>
        </div>
      </div>
      <div class="middle-section" id="middle-section">
        <ul>
          <li>
            <a href="#"><i class="fi fi-rr-user"></i>Profile</a>
          </li>
          <li>
            <a href="../validated/dashboard.jsp"
              ><i class="fi fi-rr-dashboard"></i>Dashboard</a
            >
          </li>
          <li>
          	<a href="#"><i class="fi fi-rr-bars-sort"></i>Admin List
          	</a>
          </li>
          <li><a href="#"><i class="fi fi-rr-admin-alt"></i>Add Admin</a></li>
          <li>
            <a href="../validated/listEmployee.jsp"
              ><i class="fi fi-rr-list"></i>Employee List</a
            >
          </li>
		  <li>
            <a href="../validated/addEmployee.jsp"
              ><i class="fi fi-rr-user-add"></i>Add Employee</a
            >
          </li>
          <li>
            <a href="../validated/department.jsp"
              ><i class="fi fi-rr-split"></i>Department</a
            >
          </li>
          <li>
          	<a href="#"><i class="fi fi-rr-code-branch"></i>Add Department</a>
          </li>
          
        </ul>
      </div>
      <div class="bottom-section" id="bottom-section">
        <form action="<%= request.getContextPath() %>/LogoutAdmin" method="get">
          <button type="submit">
            <i class="fi fi-rr-sign-out-alt"></i>Logout
          </button>
        </form>
      </div>
    </nav>
  </body>
</html>
