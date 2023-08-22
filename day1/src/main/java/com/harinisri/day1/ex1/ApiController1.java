package com.harinisri.day1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController1 {
	@GetMapping("/w")
	public String welcome() {
		return "Welcome String Boot!";
	}
}
