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
		return emplopyeeDao.viewAllEmplyee();
	}

	public boolean updateEmployeeService(Employee employee) {
		// TODO Auto-generated method stub
		return emplopyeeDao.updateEmployee(employee);
	}

	@Override
	public List<Employee> getSpecificEmployeeService(int id) {
		// TODO Auto-generated method stub
		return emplopyeeDao.getSpecificEmployee(id);
	}

	@Override
	public List<Employee> getMaxSalaryService() {
		// TODO Auto-generated method stub
		return emplopyeeDao.getMaxSalary();
	}

	@Override
	public List<Employee> getSecondMaxSalaryService() {
		// TODO Auto-generated method stub
		return emplopyeeDao.getSecondMaxSalary();
	}

	@Override
	public List<Employee> getMinSalaryService() {
		// TODO Auto-generated method stub
		return emplopyeeDao.getMinSalary();
	}

	@Override
	public boolean deleteEmployeeService(int id) {
		// TODO Auto-generated method stub
		return emplopyeeDao.deleteEmployee(id);
	}

}
