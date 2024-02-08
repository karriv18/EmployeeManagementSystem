package com.ems.controller;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException; 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import com.ems.model.AdminModel;
import com.ems.dao.AdminDao;
import java.io.PrintWriter;
import javax.servlet.http.HttpSession;
public class AdminServlet extends HttpServlet{
	
	private AdminDao ad = new AdminDao();
	
	public AdminServlet() {}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		HttpSession session = req.getSession();
		AdminModel am = new AdminModel(0, email, password);
		
		boolean isExist = ad.selectAdmin(am);
		PrintWriter out = res.getWriter();
//		String name = "karl";
		if (isExist) { 
			session.setAttribute("email", email);
//			req.setAttribute("name", name);
			RequestDispatcher rd = req.getRequestDispatcher("/AdminDashboard");
			rd.forward(req, res);
			
			System.out.println(session.getAttribute("email"));
			
			
		} else {
			res.sendRedirect("views/apply.html");
			System.out.println("Waley");
		}
		
	}
}
