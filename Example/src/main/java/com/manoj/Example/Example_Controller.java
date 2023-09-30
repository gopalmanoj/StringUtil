package com.manoj.Example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example_Controller {

	@GetMapping("/exa")
	public String getMessage()
	{
		return "Hello Welcome to the example page !";
	}
}
