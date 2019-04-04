package com.demo.rest;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.BaseService;

@RestController
public class BaseRest {

	@Autowired
	private BaseService baseService;

	@GetMapping("A")
	public Object index() {
		baseService.doSomething();
		return new Date();
	}

}
