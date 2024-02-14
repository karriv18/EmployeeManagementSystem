package com.ems.dao;
import java.sql.*;
import com.ems.model.AdminModel;
public class AdminDao extends WorkerDao{
	protected final String DB_URL = "jdbc:mysql://localhost/ems";
	protected final String DB_UNAME = "root"; 
	protected final String DB_PASS = ""; 
	
	private final String SELECT_ADM = "SELECT email, password FROM admin WHERE email = ? AND password = ?;";
	
	public boolean selectAdmin(AdminModel am){
		boolean isExist = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(SELECT_ADM);
			ps.setString(1, am.getEmail());
			ps.setString(2, am.getPassword());
			
			ResultSet rs = ps.executeQuery();
			
			if (!rs.next()) {
				System.out.println("wala tanga");
				System.out.println(false);
				return false;
			}
			String email = rs.getString("email");
			String password = rs.getString("password");
			System.out.println(email + " " + password);
			System.out.println(true);
			return true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return isExist;

	}
	
}
