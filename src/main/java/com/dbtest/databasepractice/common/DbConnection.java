package com.dbtest.databasepractice.common;

import java.sql.Connection;
import java.sql.DriverManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DbConnection {
	private static Logger logger = LoggerFactory.getLogger(DbConnection.class);
	
	public static Connection conn = null;
	public static String JDBC_URL = "jdbc:sqlserver://vNTDACWSSQLD002:1433;"
			+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123";
 
	public Connection DBConnection() {
		try {
				conn = DriverManager.getConnection("jdbc:sqlserver://vNTDACWSSQLD002:1433;"
						+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123");
				logger.info("Connection Created");
				return conn;
		} catch (Exception e) {
			logger.info("Connection error"+e.getMessage());
			return conn;
		}
	}
	
}
