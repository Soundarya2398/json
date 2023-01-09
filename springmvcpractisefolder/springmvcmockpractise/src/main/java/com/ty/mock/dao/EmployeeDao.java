package com.ty.mock.dao;

import com.ty.mock.dto.Employee;

public interface EmployeeDao {

	public Employee validate(int id, String password);
	
	public boolean delete(int id);
	
	public boolean add(Employee employee);
	
	public boolean update(Employee employee);
	
	public Employee search(int eid);
}
