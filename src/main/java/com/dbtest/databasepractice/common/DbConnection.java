package com.dbtest.databasepractice.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	public static Connection conn;
	public static String JDBC_URL = "jdbc:sqlserver://vNTDACWSSQLD002:1433;"
			+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123";
 
	public Connection DBConnection() {
		try {
				conn = DriverManager.getConnection("jdbc:sqlserver://vNTDACWSSQLD002:1433;"
						+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123");
				System.out.println("Created");
				return conn;
		} catch (Exception e) {
			System.out.println("Connection error: "+e.getMessage());
			return conn;
		}
	}
	
}
