package com.infy.aws.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestService {
	@GetMapping("/demo")
	public String hello() {
		return "Hello I am first version";
	}
	
}
