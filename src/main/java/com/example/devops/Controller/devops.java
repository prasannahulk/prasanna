package com.example.devops.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class devops {
@RequestMapping(value="/add")
public String dev() {
	return "success";
	
}
}
