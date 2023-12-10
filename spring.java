package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class spring {
	@RequestMapping("/test")
	public	String	Index()
	{
		return"Hellooo	World";
	}

}
