package com.ems.model;

public abstract class WorkerModel {
	private int id;
	private String firstName; 
	private String middleName; 
	private String lastName; 
	private String email;
	private String password;
	private String department; 
	
	public WorkerModel() {}
	
	public WorkerModel(int id, 
			String firstName, 
			String middleName, 
			String lastName, 
			String email, 
			String password,
			String department) {
		this.id = id; 
		this.firstName = firstName; 
		this.middleName = middleName; 
		this.lastName = lastName; 
		this.email = email; 
		this.password = password;
		this.department = department;
	}
	
	public WorkerModel(int id, String firstName, String lastName, String email, String department) {
		this(id, firstName, null, lastName, email, null, department);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName; 
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName; 
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName; 
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
