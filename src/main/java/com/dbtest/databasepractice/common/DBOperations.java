package com.dbtest.databasepractice.common;

import java.sql.SQLException;
import java.sql.Statement;

import com.dbtest.databasepractice.model.Employee;

public class DBOperations {
	
	
	
	public void insert(Employee employee) {
		
		DbConnection dbConnection = new DbConnection();
		
		try {
			Statement statement = dbConnection.DBConnection().createStatement();
			
			statement.executeUpdate("INSERT INTO T_EMPLOYEEINFO (esal , efirstname , eaddress , elastname) " + "VALUES ("+employee.getSalary()+", '"+employee.getFirstName()+"', '"+employee.getAddress()+"', '"+employee.getLastName()+"')");
			
			//ps.setString(employee.getSalary(),employee.getFirstName(),employee.getAddress(),employee.getLastName());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error on insert " + e);
		}
		
	}

}
