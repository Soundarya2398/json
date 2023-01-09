package com.ty.mock.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.ty.mock.dto.Employee;
import com.ty.mock.dto.ExceptionClass;

@Repository
public class EmployeeDaoImplimentation implements EmployeeDao {

	@Override
	public Employee validate(int id, String password) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mock");
		EntityManager manager = factory.createEntityManager();
		Employee employee = manager.find(Employee.class, id);
		if (employee != null) {
			if (employee.getPassword().equals(password)) {
				return employee;
			}
			throw new ExceptionClass("invalid password!");
		}
		throw new ExceptionClass("invalid id");
	}

	@Override
	public boolean delete(int id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mock");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Employee employee = manager.find(Employee.class, id);

		if (employee != null) {
			transaction.begin();
			manager.remove(employee);
			transaction.commit();
			//System.out.println(employee);
			return true;
		}

		throw new ExceptionClass("no such id is present!! PlEASE CHECK THE ID");

	}

	@Override
	public boolean add(Employee employee) {
		EntityTransaction transaction=null;
		boolean result = false;;
		try {
			
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("mock");
			EntityManager manager=factory.createEntityManager();
			if(employee!=null) {
			transaction=manager.getTransaction();
			transaction.begin();
			manager.persist(employee);
			if(employee!=null) {
				result=true;
				}else {
					result=false;
				}
			transaction.commit();
			
			
}
		} catch (Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			
			e.printStackTrace();
		}
		return result;

}

	@Override
	public boolean update(Employee employee) {
		boolean result=false;
		
		EntityTransaction transaction=null;
		
		try {
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("mock");
			EntityManager manager=factory.createEntityManager();
			transaction=manager.getTransaction();
			 Employee employee1=manager.find(Employee.class,employee.getEid());
			 transaction.begin();
			 if(employee1!=null) {
			employee1.setEid(employee.getEid());
			employee1.setEname(employee.getEname());
			employee1.setSal(employee.getSal());
			employee1.setPassword(employee.getPassword());
			
				result=true;
			}else {
				result=false;
			}
			 transaction.commit();
		} catch (Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			
			e.printStackTrace();
		}
		return result;
		 
		
		
	}

	@Override
	public Employee search(int eid) {
		
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("mock");
		EntityManager manager=factory.createEntityManager();
		Employee employee=manager.find(Employee.class, eid);
		if(employee!=null) {
			return employee;
		}else {
			return null;
		}
		
		
	
	}
}
