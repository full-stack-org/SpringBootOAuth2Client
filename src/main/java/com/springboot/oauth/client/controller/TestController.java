package com.springboot.oauth.client.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oauth/hello")
public class TestController {

	@GetMapping
	public String message(Principal principal) {
		return principal.getName() + " Welcome to My App";
	}

}
