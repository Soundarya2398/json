package com.te.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.student.dao.StudentDao;
import com.te.student.dto.Student;
@Service
public class StudentServiceImplimentation implements StudentService {
	@Autowired
	private StudentDao dao;

	@Override
	public Student validate(int id, String password) {
		if(id>0) 
			
			return dao.validate(id, password);
		
		return null;
	}

	@Override
	public Student studentDetails(int id) {
		if(id>0)
			return dao.studentDetail(id);
		return null;
	}
	

}
