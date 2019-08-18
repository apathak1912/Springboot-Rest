package com.restclient.example.controller;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.restclient.example.module.User;

@RestController
@RequestMapping(path ="/controllergetforEntity")
public class ControllergetForEntity {
	
	@GetMapping(path ="/user")
	public ResponseEntity<User> getUser() {
		
		
		
		String url ="http://localhost:8080/test/getUser/3";
		RestTemplate resttemplate = new RestTemplate();
		
		ResponseEntity<User> result = resttemplate.getForEntity(url, User.class);
		
		return result;
	}
	
	@GetMapping(path="/userwithmap")
	public ResponseEntity<String> getUserWithMap(){
		String url ="http://localhost:8080/test/getUser/{id}";
		RestTemplate resttemplate = new RestTemplate();
		Map<String,Integer> pathvariables = new TreeMap<String,Integer>();
		pathvariables.put("id", 3);
		String result = resttemplate.getForObject(url, String.class,pathvariables);
		return new ResponseEntity<String>(result,HttpStatus.OK);
	}

}
