package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoSpringBootController {
	
	@GetMapping(value = "/saludo")
	public String saludo() {
		return "Hola Mundo con Spring Boot";
	}

}
