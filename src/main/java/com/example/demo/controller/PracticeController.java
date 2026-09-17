package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class PracticeController {
	
	@GetMapping("tarou")
	public String tarouView() {
		return "tarou";
	}
	
	@GetMapping("hanako")
	public String hanakoView() {
		return "hanako";
		
	}
}
