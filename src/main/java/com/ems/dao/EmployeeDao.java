package com.ems.dao;
import com.ems.dao.*;
import java.sql.*;
import com.ems.model.EmployeeModel;

public class EmployeeDao extends WorkerDao {

	private final String INSERT_EMP = "INSERT INTO employee(firstName, middleName, lastName, email, department)"
										+ "VALUES(?, ?, ?, ?, ?);";
	private final String SELECT_EMP = "SELECT * FROM employee WHERE id = ?;";
	private final String UPDATE_EMPLOYEE = "UPDATE employee "
			+ "SET firstName = ?, middleName = ?, lastName = ?, email = ?, department = ?"
			+ "WHERE id = ?;";
	
	// Create
	public void insertEmployee(EmployeeModel ed) {
		try {
			Connection conn = getConnection();
			PreparedStatement pst = conn.prepareStatement(INSERT_EMP);
			
			pst.setString(1, ed.getFirstName());
			pst.setString(2, ed.getMiddleName());
			pst.setString(3, ed.getLastName());
			pst.setString(4, ed.getEmail());
			pst.setString(5, ed.getDepartment());
			pst.execute();
			
			System.out.println("Success!");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	// Read
	public void selectEmployee(int id) {
		try {
			Connection conn = getConnection(); 
			PreparedStatement pst = conn.prepareStatement(SELECT_EMP);
			pst.setInt(1, id);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				int uid = rs.getInt("id");
				String firstName = rs.getString("firstName");
				String middleName = rs.getString("middleName"); 
				String lastName = rs.getString("lastName");
				String email = rs.getString("email");
				String department = rs.getString("department");
				
				System.out.println(firstName + " " + lastName +  " " + uid);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public int updateEmployee(EmployeeModel em) {
		int status = 0;
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(UPDATE_EMPLOYEE);
			ps.setString(1, em.getFirstName());
			ps.setString(2, em.getMiddleName());
			ps.setString(3, em.getLastName());
			ps.setString(4, em.getEmail());
			ps.setString(5, em.getDepartment());
			ps.setInt(6, em.getId());
			
			status = ps.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	public EmployeeModel getEmployeeById(int id) {
		EmployeeModel em = new EmployeeModel(); 
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(SELECT_EMP);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				em.setId(rs.getInt("id"));
				em.setFirstName(rs.getString("firstName"));
				em.setMiddleName(rs.getString("middleName"));
				em.setLastName(rs.getString("lastName"));
				em.setEmail(rs.getString("email"));
				em.setDepartment(rs.getString("department"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return em;
		
	}
}	
