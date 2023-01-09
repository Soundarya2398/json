package com.te.student.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.student.dto.Student;
@Repository
public class StudentDaoImplimentation implements StudentDao {

	@Override
	public Student validate(int id, String password) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("practise");
	EntityManager manager=factory.createEntityManager();
	Student student=manager.find(Student.class, id);
	if(student!=null) {
		if(student.getPassword().equals(password)) {
			return student;
		}else {
			return null;
		}
	}
	return null;
		
	}

	@Override
	public Student studentDetail(int id) {
		
		
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("practise");
		EntityManager manager=factory.createEntityManager();
		Student student=manager.find(Student.class, id);
		if(student!=null) {
			return student;
		}else {
			return null;
		}

	}

}
