package com.dbtest.databasepractice.common;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dbtest.databasepractice.model.Employee;

public class DBOperations {
	
	DbConnection dbConnection = new DbConnection();
	Statement statement;
	
	public boolean insert(Employee employee) {
		try {
			statement = dbConnection.DBConnection().createStatement();
			
			statement.executeUpdate("INSERT INTO T_EMPLOYEEINFO (esal , efirstname , eaddress , elastname) " + "VALUES ("+employee.getSalary()+", '"+employee.getFirstName()+"', '"+employee.getAddress()+"', '"+employee.getLastName()+"')");
			dbConnection.DBConnection().close();
			//ps.setString(employee.getSalary(),employee.getFirstName(),employee.getAddress(),employee.getLastName());
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error on insert " + e);
			return false;
		}
	}
	
	public ResultSet view(){
		
		try {
			statement = dbConnection.DBConnection().createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM T_EMPLOYEEINFO;");
			dbConnection.DBConnection().close();
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
			dbConnection.DBConnection().close();
			return resultSet;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	public boolean update(Employee employee) {
		
		try {
			statement = dbConnection.DBConnection().createStatement();
			statement.executeUpdate("UPDATE T_EMPLOYEEINFO SET efirstname = '"+employee.getFirstName()+"', elastname = '"+employee.getLastName()+"', esal = "+employee.getSalary()+" , eaddress = '"+employee.getAddress()+"' WHERE eid = "+employee.getId()+";");
			dbConnection.DBConnection().close();
			return true;
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean delete(int id) {
		try {
			statement = dbConnection.DBConnection().createStatement();
			statement.executeUpdate("DELETE FROM T_EMPLOYEEINFO WHERE eid = "+id+";");
			dbConnection.DBConnection().close();
			return true;
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		
	}
	
	public ResultSet findMaxSalary() {
		try {
			statement = dbConnection.DBConnection().createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT max(esal) FROM T_EMPLOYEEINFO");
			dbConnection.DBConnection().close();
			return resultSet;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	public ResultSet findSecondMaxSalary() {
		try {
			statement = dbConnection.DBConnection().createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT max(esal) esal<(SELECT max(esal) FROM T_EMPLOYEEINFO");
			dbConnection.DBConnection().close();
			return resultSet;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public ResultSet findMinSalary() {
		try {
			statement = dbConnection.DBConnection().createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT min(esal) FROM T_EMPLOYEEINFO");
			dbConnection.DBConnection().close();
			return resultSet;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	

}
