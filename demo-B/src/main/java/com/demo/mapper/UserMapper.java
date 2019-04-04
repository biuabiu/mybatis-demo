package com.demo.mapper;

public interface UserMapper {

	void doSomething();

	default void toSaveLog() {

		System.out.println("save log");
		this.doSomething();
	}
}
