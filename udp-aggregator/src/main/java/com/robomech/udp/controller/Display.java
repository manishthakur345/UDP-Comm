package com.robomech.udp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Display {
	
	@GetMapping("/getData")
	public String getData() {
		return "";
	}
	
	
}
