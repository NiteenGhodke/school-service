package com.niteen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niteen.bean.UserBean;

@RestController
public class SchoolController {
	@GetMapping(value ="welcome")
	public String welcomeSchool() {
		return "Hello Everyone,Welcome back to school your best childhood memories....!!!!";
	}
	@RequestMapping(value="/getUserById/{id}",method = RequestMethod.GET)
	public UserBean getUserById(@PathVariable("id") int id) {
		System.out.println("id = " + id);
		UserBean user = new UserBean("Ram");
		return user;
		
	}
}
