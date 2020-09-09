package com.temelius.sp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class RequestParameters {
	@RequestMapping("/hello")
	public String hello(@RequestParam(name="location") String location, @RequestParam(name="name") String name) {
		return "Welcome to the " + location + " " + name + "!";
	}
}
