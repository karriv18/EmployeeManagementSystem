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
	
	public AdminServlet() { super(); }
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		req.setAttribute("error", null);
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		PrintWriter out = res.getWriter();
		HttpSession session = req.getSession();
		AdminModel am = new AdminModel(0, email, password);
		
		boolean isExist = ad.selectAdmin(am);
		String error = " ";
		
		if (email.isEmpty()) {
			error = "Empty fields are not allowed";
			errorSetting(req, res, error);
			return;
		}
		if (password.isEmpty()) {
			error = "Empty fields are not allowed";
			errorSetting(req, res, error);
			return;
		}
		
		if (!isExist) {
			error = "Wrong Credentials";
			errorSetting(req, res, error);
			return;
		}

		session.setAttribute("email", email);
		RequestDispatcher rd = req.getRequestDispatcher("/AdminDashboard");
		rd.forward(req, res);
	}
	public String errorSetting(HttpServletRequest req, HttpServletResponse res, String error) throws ServletException, IOException {
		req.setAttribute("error", error);
		RequestDispatcher rd = req.getRequestDispatcher("views/form/login.jsp");
		rd.forward(req, res);
//		req.setAttribute("error", "");
		return error;
	}
}
