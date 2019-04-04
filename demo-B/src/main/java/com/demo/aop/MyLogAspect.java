package com.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.mapper.UserMapper;

@Aspect // 定义为切面
@Component // 纳入容器管理
public class MyLogAspect {

	@Autowired
	UserMapper userMapper;

	// 前置通知
	@Around("@annotation(com.demo.annotation.Log)") // 拦截标记注解的地方
	public Object around(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("进入AOP");
		userMapper.toSaveLog();
		return jp.proceed();

	}
}
