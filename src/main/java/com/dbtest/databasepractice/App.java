package com.dbtest.databasepractice;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String number;
		Scanner scanner = new Scanner(System.in);
		
		ViewDataFromDB viewDataFromDB = new ViewDataFromDB();
		
		boolean flag = true;

		while (flag) {
			System.out.println("Select the option which operation you want to do");
			System.out.println("");

			System.out.println("Press 1 to add an Employee on the system");
			System.out.println("Press 2 to see all the Employee of the system");
			System.out.println("Press 3 to see a specific Employee from the system");
			System.out.println("Press 4 to update an Employee info of the system");
			System.out.println("Press 5 to delete an Employee from the system");
			System.out.println("Press 6 to see the max salary");
			System.out.println("Press 7 to see the second max salary");
			System.out.println("Press 8 to see the min salary");
			System.out.println("Press 9 to exit from doing the operations");
			
			number = scanner.nextLine();
			
			switch(number){  
		    //Case statements  
		    case "1": viewDataFromDB.employeeAdd();  
		    break;  
		    case "2": viewDataFromDB.viewAllEmployee();
		    break;
		    case "3": viewDataFromDB.viewSpecificEmployee();
		    break;
		    case "4": viewDataFromDB.employeeUpdate();  
		    break; 
		    case "5": viewDataFromDB.employeeDelete();  
		    break;
		    case "6": viewDataFromDB.viewMaxSalary();  
		    break;
		    case "7": viewDataFromDB.viewSecondMaxSalary();  
		    break;
		    case "8": viewDataFromDB.viewMinSalary();  
		    break;
		    case "9": flag = false;  
		    break;
		    //Default case statement  
		    default: System.out.println("Wrong entered. Please enter the correct option");
		    }

		}
		scanner.close();
	}
}
