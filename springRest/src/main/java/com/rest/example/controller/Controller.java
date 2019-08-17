package com.rest.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.example.module.User;

@RestController
@RequestMapping(path="/test")
public class Controller {
	
	@GetMapping(path="/message")
	public String showMessage() {
		return "its working..";
	}
	
	@GetMapping(path ="/roll/{roll}")
	public String getRoll(@PathVariable("id") int roll) {
		return "your roll number is"+roll;
	}
	
	@GetMapping(path="/getUser/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getUser(@PathVariable("id") int id){
		
		if(id == 3) {
			User user = new User(1, "Canada", "Anuj");
			return new ResponseEntity<>(user,HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
	}
}
