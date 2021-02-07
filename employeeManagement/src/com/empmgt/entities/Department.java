package com.empmgt.entities;

public class Department {
	private String deptId;
	private String deptName;

	public Department(String deptId, String deptName) {

	}

	public Department() {

	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptname(String deptName) {
		this.deptName = deptName;
	}
}
