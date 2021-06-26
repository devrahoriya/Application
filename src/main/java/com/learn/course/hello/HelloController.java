package com.learn.course.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/app")
	public String sayApp() {
	return "Application";
	}
}
