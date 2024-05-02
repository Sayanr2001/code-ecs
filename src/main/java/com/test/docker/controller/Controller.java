package com.test.docker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.docker.request.Request;
import com.test.docker.response.Response;
import com.test.docker.service.Service;
import com.test.docker.serviceimpl.ServiceImpl;

@RestController
public class Controller {

	 Service service=new ServiceImpl();
	 
	 @PostMapping("/hello")
	 public ResponseEntity<Response>sayHello(@RequestBody Request request){
		 
		 String message = request.getMessage();
		 String greeting = service.sayHello(message);
		 Response response =new Response();
		 response.setGreeting(greeting);
		 return new ResponseEntity<>(response, HttpStatus.OK);
		 
	 }
	
}
