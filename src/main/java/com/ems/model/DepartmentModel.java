package com.ems.model;

public class DepartmentModel {
	private int id; 
	private String name; 
	private int personelId; 
	
	public DepartmentModel() { super();}
	
	public DepartmentModel(int id, String name, int personelId) {
		this.id = id; 
		this.name = name; 
		this.personelId = personelId;
	}
	
	public int getId() {
		return id; 
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPersonelId() {
		return personelId;
	}
	public void setPersonelId(int id) {
		this.personelId = id;
	}
}
