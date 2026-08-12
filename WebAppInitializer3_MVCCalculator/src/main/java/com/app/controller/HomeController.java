package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController 
{
	@RequestMapping("/")
	public String cal()
	{
		return "calculator";
	}
	
		@RequestMapping("/add")
		public String add()
		{
			return "addition";
		}
	
		@RequestMapping("/sub")
		public String sub()
		{
			return "subtraction";
		}
	
		@RequestMapping("/mul")
		public String mul()
		{
			return "multiplication";
		}
		@RequestMapping("/div")
		public String div()
		{
			return "division";
		}
		
		@RequestMapping("/back")
		public String bk()
		{
			return "calculator";
		}
		
		@RequestMapping("/AddRes")
		public String AddRes(@RequestParam("num1") int num1, @RequestParam("num2")int num2, Model m)
		{
			int result=num1+num2;
			System.out.println("Addition of Both number is: "+ result);
			m.addAttribute("add", result);		
			return "result";
		}
		

}
