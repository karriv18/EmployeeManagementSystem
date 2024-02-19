package com.ems.controller;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;
import com.ems.model.DepartmentModel;
import com.ems.dao.DepartmentDao;

import java.io.IOException;
import java.sql.*;

public class DepartmentServlet extends HttpServlet{
	
	DepartmentDao dd = new DepartmentDao();
	
	public DepartmentServlet() {}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String departmentName = request.getParameter("departmentName");
//		String 
		DepartmentModel dm = new DepartmentModel();
		dm.setName(departmentName);
		dd.insertDepartment(dm);
		
		response.sendRedirect("views/validated/Department/department.jsp");
	}
}
