package com.Manual.controlller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/request")
public class ManualController {
	
	@GetMapping(value="/name")
	public String get() {
		return "RajVasu";
	}

}
