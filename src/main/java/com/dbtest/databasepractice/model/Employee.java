package com.dbtest.databasepractice.model;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private int salary;
	
	public Employee(String firstName, String lastName, String address, int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.salary = salary;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
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
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	

}
