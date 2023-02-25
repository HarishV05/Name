package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class name {
			@GetMapping("/Harish")
			public String getName()
			{
				String name="Harish";
				return "Welcome "+name+"!";
			}
}