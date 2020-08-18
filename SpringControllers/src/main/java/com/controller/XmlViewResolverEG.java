package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class XmlViewResolverEG {
	

//	@RequestMapping(method=RequestMethod.GET)
	@RequestMapping("/xmlViewResolverEG")
	public String display(ModelMap mv)
	{
		mv.addAttribute("ResolverType", "XMLViewResolver is been used");
		
		//Model model;
		
		
		return "xmlViewResolverEG";
		
	}

}
