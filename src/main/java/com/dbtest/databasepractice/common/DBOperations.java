package com.dbtest.databasepractice.common;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dbtest.databasepractice.model.Employee;

public class DBOperations {
	
	DbConnection dbConnection = new DbConnection();
	Statement statement;
	PreparedStatement prepareStatement;
	//boolean flag = true;
	
	private static Logger logger = LoggerFactory.getLogger(DBOperations.class);
	
	public boolean insert(Employee employee) {
		try {
			prepareStatement = dbConnection.DBConnection().prepareStatement("INSERT INTO T_EMPLOYEEINFO (esal , efirstname , eaddress , elastname) " + "VALUES (?,?,?,?)");
			prepareStatement.setInt(1, employee.getSalary());
			prepareStatement.setString(2, employee.getFirstName());
			prepareStatement.setString(3, employee.getAddress());
			prepareStatement.setString(4, employee.getLastName());
			prepareStatement.executeUpdate();
			//statement.executeUpdate("INSERT INTO T_EMPLOYEEINFO (esal , efirstname , eaddress , elastname) " + "VALUES ("+employee.getSalary()+", '"+employee.getFirstName()+"', '"+employee.getAddress()+"', '"+employee.getLastName()+"')");
			//dbConnection.DBConnection().close();
			//ps.setString(employee.getSalary(),employee.getFirstName(),employee.getAddress(),employee.getLastName());
			return true;
		} catch (SQLException e) {
			logger.info("Error on insert " + e);
			return false;
			//return false;
		}
		finally {
			if(dbConnection.DBConnection() != null) {
				try {
					dbConnection.DBConnection().close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					logger.info("Error : " + e);
				}
			}
		}
	}
	
	public ResultSet view(){
		
		try {
			statement = dbConnection.DBConnection().createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM T_EMPLOYEEINFO");
			return resultSet;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		finally {
			if(dbConnection.DBConnection()!= null) {
				try {
					dbConnection.DBConnection().close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					logger.info("Error : " + e);
				}
			}
		}
	}
	
	public ResultSet getSpecificData(int id) {
		try {
			statement = dbConnection.DBConnection().createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM T_EMPLOYEEINFO where eid = "+id+"");
			return resultSet;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		finally {
			if(dbConnection.DBConnection()!= null) {
				try {
					dbConnection.DBConnection().close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					logger.info("Error : " + e);
				}
			}
		}
	}
	
	public boolean update(Employee employee) {
		
		try {
			prepareStatement = dbConnection.DBConnection().prepareStatement("UPDATE T_EMPLOYEEINFO SET efirstname = ?, elastname = ?, esal = ? , eaddress = ? WHERE eid = ?");
			//statement = dbConnection.DBConnection().createStatement();
			//statement.executeUpdate("UPDATE T_EMPLOYEEINFO SET efirstname = ?, elastname = ?, esal = ? , eaddress = ? WHERE eid = ?");
			prepareStatement.setString(1, employee.getFirstName());
			prepareStatement.setString(2, employee.getLastName());
			prepareStatement.setInt(3, employee.getSalary());
			prepareStatement.setString(4, employee.getAddress());
			prepareStatement.setInt(5, employee.getId());
			prepareStatement.executeUpdate();
			return true;
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		finally {
			if(dbConnection.DBConnection()!= null) {
				try {
					dbConnection.DBConnection().close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					logger.info("Error : " + e);
				}
			}
		}
	}
	
	public boolean delete(int id) {
		try {
			prepareStatement = dbConnection.DBConnection().prepareStatement("DELETE FROM T_EMPLOYEEINFO WHERE eid = ?");
			prepareStatement.setInt(1, id);
			prepareStatement.executeUpdate();
			//statement = dbConnection.DBConnection().createStatement();
			//statement.executeUpdate("DELETE FROM T_EMPLOYEEINFO WHERE eid = "+id+";");
			return true;
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		finally {
			if(dbConnection.DBConnection()!= null) {
				try {
					dbConnection.DBConnection().close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					logger.info("Error : " + e);
				}
			}
		}
	}
	
	public ResultSet findMaxSalary() {
		try {
			statement = dbConnection.DBConnection().createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM T_EMPLOYEEINFO where esal = (SELECT max(esal) FROM T_EMPLOYEEINFO)");
			return resultSet;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		finally {
			if(dbConnection.DBConnection()!= null) {
				try {
					dbConnection.DBConnection().close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					logger.info("Error : " + e);
				}
			}
		}
	}
	
	public ResultSet findSecondMaxSalary() {
		try {
			statement = dbConnection.DBConnection().createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM T_EMPLOYEEINFO where esal = (SELECT MAX(esal) From T_EMPLOYEEINFO WHERE esal < ( SELECT max(esal) FROM T_EMPLOYEEINFO))");
			return resultSet;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		finally {
			if(dbConnection.DBConnection()!= null) {
				try {
					dbConnection.DBConnection().close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					logger.info("Error : " + e);
				}
			}
		}
	}
	
	public ResultSet findMinSalary() {
		try {
			statement = dbConnection.DBConnection().createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM T_EMPLOYEEINFO where esal = (SELECT min(esal) FROM T_EMPLOYEEINFO)");
			return resultSet;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		finally {
			if(dbConnection.DBConnection()!= null) {
				try {
					dbConnection.DBConnection().close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					logger.info("Error : " + e);
				}
			}
		}
	}
}
