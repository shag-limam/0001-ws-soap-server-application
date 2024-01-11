package com.javaws.services;

import jakarta.jws.WebService;

@WebService
public class WSHello {
	public String sayHello() {
		return "Hello Word Welcome to my web service";
	}
}
