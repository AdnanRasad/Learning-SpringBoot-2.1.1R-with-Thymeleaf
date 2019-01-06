package com.luv2code.springdemo.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestcontroller {

	@GetMapping("/")
	public String sayHello() {
		
		return "Hello World! Time on server is "+LocalDateTime.now();
		
	}
	
	
	
	
	
}
