package com.te.mavenjson.bean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessorOrder;
//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

import lombok.Data;
@Data
@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
@JsonPropertyOrder({"s_name", "s_id"})
public class Student1 implements Serializable {
	@JsonProperty("s_id")
	private int sid;
	@JsonProperty("s_name")
	private String sname;
	@JsonProperty("s_marks")
	private double marks;
	@JsonIgnore
	private String password;

}
