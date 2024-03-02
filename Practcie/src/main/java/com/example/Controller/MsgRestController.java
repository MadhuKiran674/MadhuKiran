package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MsgRestController {

	@GetMapping("/welcome")
	
	public String getWelcomeMsg() {
		String msg = "Welcome to REST API..!!";
		return "welcome";
	}

}
