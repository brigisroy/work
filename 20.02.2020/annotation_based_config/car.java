package com.test;

import org.springframework.stereotype.Component;



@Component
public class car implements vehicle {
	public void drive() {
		System.out.println("this from car Class");
	}
}
