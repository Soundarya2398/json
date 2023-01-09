package com.ty.mock.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Employee implements Serializable{
	@Id
	@Column
	private int eid;
	@Column
	private String ename;
	@Column
	private double sal;
	@Column
	private String password;
	
	

}
