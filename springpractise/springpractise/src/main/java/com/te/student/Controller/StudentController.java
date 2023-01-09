package com.te.student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.student.dto.Student;
import com.te.student.service.StudentService;

@Controller
public class StudentController {
	
	  @Autowired
	  private StudentService service;
	 
	@GetMapping("/login")
	public String getLoginPage() {
		return "loginForm";
	}
	@PostMapping("/login")
	public String getHomePage(ModelMap map,int sid,String password) {
		Student student=service.validate(sid, password);
		if(student!=null) {
		map.addAttribute("msg",student.getSname());
		return "homePage";
		}else {
			map.addAttribute("errMsg", "Please! check your Login details");
			return "loginForm";
		}
		
	}
	
	@GetMapping("/search")
	public String getStudentDetails(Student student,ModelMap map) {
		if(student!=null) {
			return "searchPage";
		}else {
			map.addAttribute("errMsg","please login first");
			return "loginForm";
			
		}
	}
	@PostMapping("/search")
	public String getSearchPage(int sid,ModelMap map) {
		Student student=service.studentDetails(sid);
		if(student!=null) {
			map.addAttribute("student",student);	
		}else {
			map.addAttribute("errMsg","no data present in this id!!INVALID");
		}
			return "searchPage";
	}

	
		
	}
	
	
	
	
	

	
