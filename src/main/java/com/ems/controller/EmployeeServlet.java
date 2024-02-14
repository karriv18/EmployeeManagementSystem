package com.ems.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.ems.model.*;
import com.ems.dao.*;
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("firstName");
		String middleName = request.getParameter("middleName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String department = request.getParameter("department");
		int id = 0; 
		EmployeeModel em = new EmployeeModel(id, firstName, middleName, lastName, email, department);
		EmployeeDao ed = new EmployeeDao();
		
		ed.insertEmployee(em);
//		RequestDispatcher rd = request.getRequestDispatcher("/adminServlet");
//		rd.forward(request, response);
		
		response.sendRedirect("views/validated/dashboard.jsp");
	}

}
