package com.awscicddemo.AWSCICDDemo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ItemController {

	@GetMapping("/home")
	public String home() {
		return "Welcome to AWS Demo";
	}

}
