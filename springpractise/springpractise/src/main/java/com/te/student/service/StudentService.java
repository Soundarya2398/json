package com.te.student.service;

import com.te.student.dao.StudentDao;
import com.te.student.dto.Student;

public interface StudentService {
	
	public Student validate(int id,String password);
	
	public Student studentDetails(int id);

}