package com.te.student.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table
public class Student implements Serializable {
	@Id
	@Column
	private int sid;
	@Column
	private String sname;
	@Column
	private double marks;
	@Column
	private String password;
	

}
