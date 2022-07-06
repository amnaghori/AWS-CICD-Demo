package com.awscicddemo.AWSCICDDemo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:8080")
public class ItemController {

	@GetMapping("/home")
	public String home() {
		return "Welcome to AWS Demo";
	}

}
