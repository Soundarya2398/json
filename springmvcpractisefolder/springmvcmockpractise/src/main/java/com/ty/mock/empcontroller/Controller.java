package com.ty.mock.empcontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ty.mock.dto.Employee;
import com.ty.mock.service.EmployeeService;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/login")
	public String getLogin() {
		return "samplemodel";
	}
	
	@PostMapping("/login")
	public String getLoginDetails(ModelMap map,int id,String password,HttpServletRequest req) {
		Employee employee=service.validate(id, password);
		if(employee!=null) {
			map.addAttribute("msg", employee.getEname());
				return "homepage";
			}else {
				map.addAttribute("errMsg","Invalid Creditionals");
				return "samplemodel";
			}
		}
	@GetMapping("/delete")		
	public String deleteid(ModelMap map) {
		return "deleteform";
	}
	@PostMapping("/delete")
	public String deletedetails(ModelMap map,int id) {
		boolean delete=service.delete(id);
		if(delete) {
			map.addAttribute("msg","deleted Successfully");
			return "deleteform";
		}else {
			return "samplemodel";
		}
	}
	
	@GetMapping("/add")
	public String add() {
		return "AddForm";
	}
	
	@PostMapping("/add")
	public String addDetails(ModelMap map,Employee employee) {
		Boolean result= service.add(employee);
		if(result) {
			map.addAttribute("msg","Added Successfully");
			return "AddForm";
			
		}else {
			map.addAttribute("errMsg", "unable to add");
			return "AddForm";
		}
		
	}
	@GetMapping("/update")
	public String Update() {
		return "UpdatePage";
	}
	@PostMapping("/update")
	public String UpdateDetails(ModelMap map,Employee employee) {
		boolean update=service.update(employee);
		if(update) {
			map.addAttribute("msg","updated Successfully");
			return "UpdatePage";
			
		}
		map.addAttribute("errMsg","something went wrong");
		return "UpdatePage";
		
		
			
			
		}
	@GetMapping("/search")
	public String search() {
		return "SearchPage";
	}
	
	@PostMapping("/search")
	public String searchDetails(ModelMap map,int eid) {
		Employee employee=service.search(eid);
		if(employee!=null) {
			map.addAttribute("msg","fetched details are here");
			map.addAttribute("employee",employee);
			return "SearchPage";
		}else {
			map.addAttribute("errMsg", "id not exist");
			return "samplemodel";
			
		}
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "samplemodel";
	}
	
	
	}
	


