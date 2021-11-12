package com.wolken.monumnet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.monumnet.service.HelloService;
@Controller
public class HelloController {
	@Autowired
	HelloService service;
	@RequestMapping("/update")
	String printHello() {
		System.out.println("hello");
		service.printHello();
		return "update.jsp";
	}
}
