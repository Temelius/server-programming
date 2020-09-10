package com.temelius.sp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class HelloThymeleafController {
	@RequestMapping("/hello")
	public String greeting(
			@RequestParam(value="name") String name, 
			@RequestParam(value="age") String givenAge, 
			Model model) {
		int age = Integer.parseInt(givenAge);
		model.addAttribute("name",name);
		model.addAttribute("age", age);
		return "HelloThymeleaf";
	}
}
