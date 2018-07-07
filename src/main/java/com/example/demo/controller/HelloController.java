package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(method=RequestMethod.GET,path="/hello")
	public String hello() {
		System.out.println("Inside hello method.");
		return "Hellozz World";
	}
}
