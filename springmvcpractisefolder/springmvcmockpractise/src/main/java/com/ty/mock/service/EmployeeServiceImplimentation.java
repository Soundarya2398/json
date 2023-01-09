package com.ty.mock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.mock.dao.EmployeeDao;
import com.ty.mock.dto.Employee;

@Service
public class EmployeeServiceImplimentation implements EmployeeService {
	@Autowired
	 private EmployeeDao dao;

	@Override
	public Employee validate(int id, String password) {
		
		if(id>0) {
			return dao.validate(id, password);
		}
		
		return null;
	}

	@Override
	public boolean delete(int id) {
		if(id>0) {
			return dao.delete(id);
		}
		return false;
	}

	@Override
	public boolean add(Employee employee) {
		if(employee.getEid()>0) {
			return dao.add(employee);
		}
		
		return false;
	}

	@Override
	public boolean update(Employee employee) {
		if(employee.getEid()>0) {
			return dao.update(employee);
		}
		return false;
	}

	@Override
	public Employee search(int eid) {
		if(eid>0) {
			return dao.search(eid);
		}
		return null;
	}
	 
	
	

}
