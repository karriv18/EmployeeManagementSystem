package com.ems.dao;
import java.sql.*;
import java.util.*;
import com.ems.model.DepartmentModel;
public class DepartmentDao {
	
	private final String INSERT_DEPARTMENT = "INSERT INTO department(name)"
									+ "VALUES(?);";
	private final String SELECT_ALL_DEPARTMENT = "SELECT * FROM department;";
	
	WorkerDao wd = new WorkerDao();
	
	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = wd.getConnection();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public int insertDepartment(DepartmentModel dm) {
		Connection conn = null;
		int row = 0;
		try {
			conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(INSERT_DEPARTMENT);
			ps.setString(1, dm.getName());
			
			row  = ps.executeUpdate();
			System.out.println("Inserted");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return row; 
	}
	
	public List<DepartmentModel> getAllDepartment(){
		List<DepartmentModel> list = new ArrayList<>();
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(SELECT_ALL_DEPARTMENT);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				DepartmentModel dm = new DepartmentModel();
				dm.setId(rs.getInt("id"));
				dm.setName(rs.getString("name"));
				dm.setPersonelId(rs.getInt("personel_id"));
				list.add(dm);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
