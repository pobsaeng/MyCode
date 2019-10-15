package com.app.ab;

import java.util.List;

public class EmployeeDaoImpl extends AbstractDao<Integer, Employee> implements EmployeeDao {

	@Override
	public Employee findById(int id) {
		return getByKey(1);
	}

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployeeBySsn(String ssn) {
		
	}

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findEmployeeBySsn(String ssn) {
		// TODO Auto-generated method stub
		return null;
	}
}
