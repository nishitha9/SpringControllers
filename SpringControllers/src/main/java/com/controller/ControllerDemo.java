package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;

public class ControllerDemo extends AbstractController {
	
	public ModelAndView handleRequestInternal(HttpServletRequest request ,HttpServletResponse response)
	{
		System.out.println("Method 2");
		ModelAndView mv=new ModelAndView("display");
		mv.addObject("greet","Greeting from controller!! ");
		return mv;
	}
	
	

}
