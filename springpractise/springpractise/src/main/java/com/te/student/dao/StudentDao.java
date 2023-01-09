package com.te.student.dao;

import com.te.student.dto.Student;

public interface StudentDao {
	public Student validate(int id,String password);
	
	public Student studentDetail(int id);

}
