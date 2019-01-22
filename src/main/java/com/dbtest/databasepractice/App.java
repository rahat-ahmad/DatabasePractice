package com.dbtest.databasepractice;

import com.dbtest.databasepractice.common.DBOperations;
import com.dbtest.databasepractice.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee employee = new Employee("Rahat", "Ahmad", "9/1 hossani dalan , dhaka", 30000);
        DBOperations dbOperations = new DBOperations();
        dbOperations.insert(employee);
    }
}
