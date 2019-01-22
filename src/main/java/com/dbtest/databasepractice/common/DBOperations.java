package com.dbtest.databasepractice.common;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dbtest.databasepractice.model.Employee;

public class DBOperations {
	
	DbConnection dbConnection = new DbConnection();
	Statement statement;
	
	public void insert(Employee employee) {
		try {
			statement = dbConnection.DBConnection().createStatement();
			
			statement.executeUpdate("INSERT INTO T_EMPLOYEEINFO (esal , efirstname , eaddress , elastname) " + "VALUES ("+employee.getSalary()+", '"+employee.getFirstName()+"', '"+employee.getAddress()+"', '"+employee.getLastName()+"')");
			dbConnection.DBConnection().close();
			//ps.setString(employee.getSalary(),employee.getFirstName(),employee.getAddress(),employee.getLastName());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error on insert " + e);
		}
	}
	
	public ResultSet view(){
		
		try {
			statement = dbConnection.DBConnection().createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM T_EMPLOYEEINFO;");
			return resultSet;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	public ResultSet getSpecificData(int id) {
		try {
			statement = dbConnection.DBConnection().createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM T_EMPLOYEEINFO where eid = "+id+";");
			return resultSet;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	

}
