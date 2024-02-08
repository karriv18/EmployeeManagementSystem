package com.ems.model;

public class AdminModel extends WorkerModel{
	public AdminModel() { super(); }
	
	public AdminModel(int id, String email, String password, String department) {
		super(id, null, null, null, email, password, department);
	}
	public AdminModel(int id, String email, String password) {
		super(id, null, null, null, email, password, null);
	}
	
}
