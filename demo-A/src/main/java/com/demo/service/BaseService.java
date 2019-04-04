package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.annotation.Log;
import com.demo.mapper.BaseMapper;

@Service
public class BaseService {

	@Autowired
	private BaseMapper baseMapper;

	@Log
	public void doSomething() {
		baseMapper.doSomething();
	}

}
