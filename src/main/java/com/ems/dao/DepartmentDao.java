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
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return row; 
	}
	
	public List<DepartmentModel> getAllDepartment(DepartmentModel dm){
		List<DepartmentModel> list = new ArrayList<>();
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(SELECT_ALL_DEPARTMENT);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				DepartmentModel dm2 = new DepartmentModel();
				dm2.setId(rs.getInt("id"));
				dm2.setName(rs.getString("name"));
				dm2.setPersonelId(rs.getInt("personel_id"));
				list.add(dm2);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
