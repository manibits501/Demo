package com.tab.Admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController
{
    @GetMapping("/")
	public String show()
	{
		
	return "Registration";
	}
	
	
}
