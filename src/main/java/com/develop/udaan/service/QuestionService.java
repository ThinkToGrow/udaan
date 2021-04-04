package com.develop.udaan.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.develop.udaan.document.Question;
import com.develop.udaan.repository.QuestionRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	public void createQuestion(HttpServletRequest request) {
		questionRepository.save(createQuestionFromRequest(request));
	}
	
	private Question createQuestionFromRequest(HttpServletRequest request) {
		return new Question( request.getHeader("questionString"), 
				Arrays.asList(request.getHeader("options").split(",")), 
				Arrays.asList(request.getHeader("correctOptions").split(",")));
	}
	

}
