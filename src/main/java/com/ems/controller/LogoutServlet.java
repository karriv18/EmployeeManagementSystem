package com.ems.controller;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException; 
import javax.servlet.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;
public class LogoutServlet extends HttpServlet{
	
	public LogoutServlet() { super();} 
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		String logoutMessage = "Logout Successfully!";
		
		if (session != null) {
			session.invalidate(); 
			req.setAttribute("logout", logoutMessage);
			
			RequestDispatcher rd = req.getRequestDispatcher("views/form/login.jsp");
//			System.out.println(session.getAttribute("email"));
			rd.forward(req, res);
			System.out.println(logoutMessage);
		}
		
	}
}
