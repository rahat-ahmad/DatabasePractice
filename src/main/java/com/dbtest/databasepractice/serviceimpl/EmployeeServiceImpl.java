package com.dbtest.databasepractice.serviceimpl;

import java.util.List;

import com.dbtest.databasepractice.dao.EmployeeDao;
import com.dbtest.databasepractice.daoimpl.EmployeeDaoImpl;
import com.dbtest.databasepractice.model.Employee;
import com.dbtest.databasepractice.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDao emplopyeeDao = new EmployeeDaoImpl();

	public boolean insertEmployeeService(Employee employee) {
		
		return emplopyeeDao.insertEmployee(employee);
	}

	public List<Employee> viewAllEmployeeService() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateEmployeeService(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteEmployeeService(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getSpecificEmployeeService(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> getMaxSalaryService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getSecondMaxSalaryService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getMinSalaryService() {
		// TODO Auto-generated method stub
		return null;
	}

}
