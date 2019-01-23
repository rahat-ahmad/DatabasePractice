package com.dbtest.databasepractice;

import java.util.ArrayList;
import java.util.List;

import com.dbtest.databasepractice.common.DBOperations;
import com.dbtest.databasepractice.dao.EmployeeDao;
import com.dbtest.databasepractice.daoimpl.EmployeeDaoImpl;
import com.dbtest.databasepractice.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee employee = new Employee("Rahat", "Ahmad", "9/1 Hossani Dalan , Dhaka", 45000);
        DBOperations dbOperations = new DBOperations();
        //dbOperations.insert(employee);
        List<Employee> employeeList = new ArrayList<Employee>();
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        employeeList = employeeDao.viewAllEmplyee();
        
        for(Employee employee1 : employeeList) {
        	System.out.println(" ");
        	System.out.print(employee1.getId()+"  ");
        	System.out.print(employee1.getAddress()+"  ");
        	System.out.print(employee1.getFirstName()+"  ");
        	System.out.print(employee1.getLastName()+"  ");
        	System.out.print(employee1.getSalary() + " ");
        	System.out.println("");
        }
        employee.setId(2);
        employeeDao.updateEmployee(employee);
        
        employeeList = employeeDao.viewAllEmplyee();
        
        for(Employee employee1 : employeeList) {
        	System.out.println(" ");
        	System.out.print(employee1.getId()+"  ");
        	System.out.print(employee1.getAddress()+"  ");
        	System.out.print(employee1.getFirstName()+"  ");
        	System.out.print(employee1.getLastName()+"  ");
        	System.out.print(employee1.getSalary() + " ");
        	System.out.println("");
        }
        
        employeeDao.deleteEmployee(employee);
        
        employeeList = employeeDao.viewAllEmplyee();
        
        for(Employee employee1 : employeeList) {
        	System.out.println(" ");
        	System.out.print(employee1.getId()+"  ");
        	System.out.print(employee1.getAddress()+"  ");
        	System.out.print(employee1.getFirstName()+"  ");
        	System.out.print(employee1.getLastName()+"  ");
        	System.out.print(employee1.getSalary() + " ");
        	System.out.println("");
        }
        
    }
}
