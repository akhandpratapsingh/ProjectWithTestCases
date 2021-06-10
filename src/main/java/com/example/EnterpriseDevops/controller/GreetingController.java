package com.example.EnterpriseDevops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.EnterpriseDevops.dto.GreetingDto;

@RestController
public class GreetingController {

	@GetMapping("/greeting")
	public GreetingDto greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new GreetingDto(name, "Monday");
	}
}
