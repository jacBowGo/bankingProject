package com.app.bank.model;

public class Role {
	
	private int roleId; // primary key
	private String role; // not null, unique
	  
	public Role() {
		// TODO Auto-generated constructor stub
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	  
	  

}
