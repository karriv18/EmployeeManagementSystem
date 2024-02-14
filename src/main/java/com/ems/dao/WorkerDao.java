package com.ems.dao;
import com.ems.model.*;
import java.sql.*;
import java.util.List; 
import java.util.ArrayList;
public class WorkerDao {
	protected static final String DB_URL = "jdbc:mysql://localhost/ems";
	protected static final String DB_UNAME = "root"; 
	protected static final String DB_PASS = ""; 
	
	protected final String SELECT_ALL_EMPLOYEES = "SELECT * FROM employee";

	public Connection getConnection() throws SQLException{
		Connection conn = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PASS);
		System.out.println("Connected!");
		return conn; 
	}
	public List<WorkerModel> getAllEmployees(){
		List <WorkerModel> list = new ArrayList<>();
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(SELECT_ALL_EMPLOYEES);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				WorkerModel em = new EmployeeModel();
				em.setId(rs.getInt("id"));
				em.setFirstName(rs.getString("firstName"));
				em.setMiddleName(rs.getString("middleName"));
				em.setLastName(rs.getString("lastName"));
				em.setEmail(rs.getString("email"));
				em.setDepartment(rs.getString("department"));
				list.add(em);
			}
			for (WorkerModel e: list) {
				System.out.print(e.getId());
				System.out.print(e.getFirstName());
				System.out.print(e.getMiddleName());
				System.out.print(e.getDepartment());
				System.out.println("\n");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}
