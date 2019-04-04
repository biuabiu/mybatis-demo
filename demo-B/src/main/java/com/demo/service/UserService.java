package com.demo.service;

import org.springframework.stereotype.Service;

import com.demo.annotation.Log;

@Service
public class UserService {

	@Log
	public void selectSomething() {
		System.out.println("do something");
	}

}
