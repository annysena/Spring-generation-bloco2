package br.org.generation.helloworld.controller2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")
public class HelloController2 {
	
	@GetMapping
	public String hello2() {
		return "Olá! O objetivo de hoje é dar os primeiros passos no Spring-boot, com uma aplicação Hello Wolrd na web.";
	}
}
