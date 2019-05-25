package com.paf.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class Payment {
	
	@GetMapping("/all")
	public String allPayments() {
		return "all payments";
	}
	
	
}
