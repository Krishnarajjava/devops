package com.devops2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Devops2Controller {
	@GetMapping(value="/getValue")
	public String getValue() {
		return "Krish";
	}

}
