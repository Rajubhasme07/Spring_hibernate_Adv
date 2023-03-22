package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Customer;
import com.example.demo.model.CustomerDao;

@Controller
public class HomeController {

	@RequestMapping("/test")
	@ResponseBody
	String myfun()
	{
		return "hello world";
	}
	
	@RequestMapping("/reg")
	String myfun1(Model m)
	{
		
		Customer c=new Customer();
		
		m.addAttribute("cus", c);
		return "index";
	}
	
	@RequestMapping("/register")
	
	String myfun2(@ModelAttribute("cus") Customer c)
	{
		
		//new CustomerDao().saveCustomer(c);
		System.out.println("Data inserted = "+c);
		return "home";
	}
	
}
