package com.ems.model;

public class EmployeeModel extends WorkerModel {
	
	public EmployeeModel() { super(); }
	
	public EmployeeModel(int id, 
			String firstName, 
			String middleName, 
			String lastName, 
			String email, 
			String department) {
		
		super(id, 
				firstName, 
				middleName, 
				lastName, 
				email, 
				null,
				department);
	}
	public EmployeeModel(int id,
			String firstName, 
			String lastName, 
			String email, 
			String department
			) {
		super(id, firstName, lastName, email, department);
	}
}
