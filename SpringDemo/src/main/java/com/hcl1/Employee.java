package com.hcl1;

import java.util.ArrayList;

public class Employee {
	
	String employeeName;
	ArrayList<String>employeeMobileNumber=new ArrayList<>();
	Long employeeSalary;
	String employeeEmail;
	Address address;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public ArrayList<String> getEmployeeMobileNumber() {
		return employeeMobileNumber;
	}
	public void setEmployeeMobileNumber(ArrayList<String> employeeMobileNumber) {
		this.employeeMobileNumber = employeeMobileNumber;
	}
	public Long getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void display() {
		System.out.println("Name:"+getEmployeeName());
		System.out.println("The contact numbers are:");
		
		for(String employeeMobileNum:employeeMobileNumber)
		{
			System.out.println(employeeMobileNum);
		}
		System.out.println("Salary: "+getEmployeeSalary());
		System.out.println("Email: "+getEmployeeEmail());
	}
	
	
}
