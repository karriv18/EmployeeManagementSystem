package com.ems.controller;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;
import com.ems.model.DepartmentModel;
import com.ems.dao.DepartmentDao;

import java.sql.*;

public class DeparmentServlet extends HttpServlet{
	
	DepartmentModel dm = new DepartmentModel();
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		
	}
}
