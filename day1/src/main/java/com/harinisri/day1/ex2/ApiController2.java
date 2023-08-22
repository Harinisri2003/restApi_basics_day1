package com.harinisri.day1.ex2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController2 {
@GetMapping("/n")
public String getName()
{
	String name="IamNeo";
	return "Welcome "+name;
}
}
