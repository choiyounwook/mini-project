package com.infraware.mini.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contoller {
	
	@GetMapping(path="/hello")
	public String MarkdownToHTML() {
		return "Hello World!!!";
	}
	
}
