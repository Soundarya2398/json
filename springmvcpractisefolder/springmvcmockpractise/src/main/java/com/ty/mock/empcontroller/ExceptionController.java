package com.ty.mock.empcontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ty.mock.dto.ExceptionClass;

@ControllerAdvice
public class ExceptionController {
	@ExceptionHandler(ExceptionClass.class)
	public String getException(HttpServletRequest request,Exception exception) {
		request.setAttribute("errMsg", exception.getMessage());
		return "samplemodel";
		
	}

}
