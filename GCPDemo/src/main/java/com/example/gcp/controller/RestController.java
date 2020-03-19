package com.example.gcp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.gcp.InstanceInformationService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private InstanceInformationService service;
	
	@GetMapping("/")
	public ResponseEntity<String> getStatus(){
		return new ResponseEntity<String>("{Health Status : UP}", HttpStatus.OK);
	}
	
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World " + " V3 " + service.retrieveInstanceInfo();
	} 

}
