package com.kadam.simpleWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
		@RequestMapping("/")
		
		public String greet() {
			System.out.println("hello");
			return "Welcome to Spring boot....";
		}
		@RequestMapping("/about")
		public String about() {
			return "We dont teach, we educate!!";
		}
		
}
