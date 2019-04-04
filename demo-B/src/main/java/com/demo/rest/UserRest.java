package com.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.UserService;

@RestController
public class UserRest {

	@Autowired
	private UserService service;

	@GetMapping("/index")
	public Object index() {
		service.selectSomething();
		return HttpStatus.OK;
	}
}
