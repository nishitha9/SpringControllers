package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

//import org.springframework.web.servlet.mvc.multiaction.MultiActionController

@Controller
public class Calculator{
	
	 @RequestMapping(value ="/add", method = RequestMethod.GET)
	public ModelAndView add() {
		ModelAndView mv=new ModelAndView("result");
		int a=10;
		int b=5;
		int res_add=a+b;
		mv.addObject("result", res_add);
		return mv;
		
	}
	@RequestMapping("/sub")
	public ModelAndView sub() {
		ModelAndView mv=new ModelAndView("result");
		int a=10;
		int b=5;
		int res_sub=a-b;
		mv.addObject("result", res_sub);
		return mv;
		
	}
	
	
	
}
