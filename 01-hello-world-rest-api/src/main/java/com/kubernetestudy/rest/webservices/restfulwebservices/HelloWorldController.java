package com.kubernetestudy.rest.webservices.restfulwebservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Autowired
	private ServerInformationService service;
	
	@GetMapping(path = "/")
	public String imUpAndRunning() {
		return "{healthy:true}";
	}
	
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World " + service.retrieveInstanceInfo();
	}
	
}
