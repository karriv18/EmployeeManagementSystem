package com.ems.dao;
import java.sql.*;
import com.ems.model.AdminModel;
public class AdminDao extends WorkerDao{
	protected final String DB_URL = "jdbc:mysql://localhost/ems";
	protected final String DB_UNAME = "root"; 
	protected final String DB_PASS = ""; 
	
	private final String SELECT_ADM = "SELECT email, password FROM admin WHERE email = ? AND password = ?;";
	private final String INSERT_ADMIN = "INSERT INTO admininformation(firstName, lastName, middleName, birthDate) "
										+ "VALUES (?, ?, ?, ?, ?)";
	
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
				System.out.println(false);
				return false;
			}

			return true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return isExist;

	}
	
	public void insertAdmin(AdminModel am) {
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("");
			ps.setString(1, am.getFirstName());
			ps.setString(2, am.getLastName());
			ps.setString(3, am.getMiddleName());
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
