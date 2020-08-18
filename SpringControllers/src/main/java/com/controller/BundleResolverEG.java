package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class BundleResolverEG {

	@RequestMapping("/BundleResolverEG")
	public String display(ModelMap model)
	{
		model.addAttribute("ResolverType", "ResourceBundleResolver is been used ");
		return "BundleResolverEG";
	}
}
