package com.shivudu.dao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@GetMapping("/")
	public String getWelcomeMsg() {
		return "Welcome To Shivudu...!";
	}
}
