package com.develop.udaan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.develop.udaan.service.HelloUdaanService;

@RestController
@RequestMapping
public class HelloUdaanController {
	
	@Autowired
	private HelloUdaanService helloUdaanService;
	
	@GetMapping("/helloUdaan")
	public String helloUdaan() {
		return helloUdaanService.getHelloUdaanString();
	}

}
