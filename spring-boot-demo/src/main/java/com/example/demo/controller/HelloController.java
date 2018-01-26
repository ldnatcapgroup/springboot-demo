package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.ExchangeImpl;

@RestController
public class HelloController {
	
	@Autowired
	private ExchangeImpl exchangeService; 

	@RequestMapping("/")
	public String sayHello() {
		return "say hello";
	}
	
	
	@RequestMapping("/currencies")
	public String currencies() {
		return exchangeService.getCurrencies(); 
	} 
}
