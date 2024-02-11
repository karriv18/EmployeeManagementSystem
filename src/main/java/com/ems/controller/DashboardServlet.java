package com.ems.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;
import com.ems.model.AdminModel;
import com.ems.dao.AdminDao;

public class DashboardServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
//		req.getAttribute("name");
		res.sendRedirect("views/validated/dashboard.jsp");
	}
}
