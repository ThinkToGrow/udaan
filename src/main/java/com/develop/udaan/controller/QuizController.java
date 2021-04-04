package com.develop.udaan.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.develop.udaan.dto.QuizDto;
import com.develop.udaan.service.QuizService;

@RestController
@RequestMapping
public class QuizController {

	@Autowired
	private QuizService quizService;
	
	@PostMapping("/createQuiz")
	public void createQuiz(HttpServletRequest request) {
		quizService.createQuiz(request);
	}
	
	@PostMapping("/getQuiz")
	public QuizDto getQuiz(HttpServletRequest request) {
		return quizService.getQuizService(request);
	}
}
