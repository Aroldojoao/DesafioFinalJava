package com.MeuDesafioFinalITExperts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/aro")
public class HomeController {
	
	@GetMapping
	public String hello() {
		return " Hello World i can do this, ta fluindo uhuuu!!!!!";
	}
	
}
  