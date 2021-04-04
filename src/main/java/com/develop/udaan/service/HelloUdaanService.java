package com.develop.udaan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.develop.udaan.repository.HelloUdaanRepository;

@Service
public class HelloUdaanService {
	
	@Autowired
	private HelloUdaanRepository helloUdaanRepository;
	@Autowired
	private RestTemplate restTemplate;
	
	public String getHelloUdaanString() {
		return helloUdaanRepository.findAll().stream()
				.map(helloUdaan -> helloUdaan.getHelloUdaanString())
				.findFirst()
				.orElse("No String found...");
	}
	
}
