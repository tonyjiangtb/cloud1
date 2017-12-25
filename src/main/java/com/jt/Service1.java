package com.jt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1 {
	
	@RequestMapping("/hello")
	public String Hello() {
		return "HELLO";
	}
}
