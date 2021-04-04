package com.develop.udaan.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.develop.udaan.service.QuestionService;

@RestController
@RequestMapping
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	
	@PostMapping("/createQuestion")
	public void createQuestion(HttpServletRequest request) {
		questionService.createQuestion(request);
	}
}
