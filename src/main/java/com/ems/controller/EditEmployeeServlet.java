package com.ems.controller;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException; 
import javax.servlet.annotation.*;
import java.io.IOException; 
import java.io.PrintWriter;
import com.ems.dao.*;
import com.ems.model.*;


public class EditEmployeeServlet extends HttpServlet{
	
	private EmployeeDao ed = new EmployeeDao();
	
	public EditEmployeeServlet() {}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{

		int id  = Integer.parseInt(request.getParameter("id"));
		String firstName = request.getParameter("firstName");
		String middleName = request.getParameter("middleName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String department = request.getParameter("department");
		
		EmployeeModel em = new EmployeeModel(id, firstName, middleName, lastName, email, department);
		ed.updateEmployee(em);
		response.sendRedirect("views/validated/listEmployee.jsp");
	}
}
