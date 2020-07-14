package com.nilesh.secureapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home()
	{
		return"welcome.jsp";
	}
	
	@RequestMapping("/login")
	public String loginPage()
	{
		return"login.jsp";
	}
	
	@RequestMapping("/logout-success")
	public String logoutPage()
	{
		return"logout.jsp";
	}
}
