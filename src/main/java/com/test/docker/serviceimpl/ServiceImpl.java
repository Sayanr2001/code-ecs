package com.test.docker.serviceimpl;

import com.test.docker.service.Service;

public class ServiceImpl implements Service {

	@Override
	public String sayHello(String message) {
		if ("Hi".equalsIgnoreCase(message.trim())) {
            return "Hello";
        } else {
            return "Invalid input";
        }
	}

	
}
