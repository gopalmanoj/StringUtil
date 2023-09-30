package com.example.bank.user_request;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller_Employee {
@GetMapping("/m")
public String getMessage()
{
	return "User service new controller message";
}
}
