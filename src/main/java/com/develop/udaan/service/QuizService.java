package com.develop.udaan.service;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.develop.udaan.document.Question;
import com.develop.udaan.document.Quiz;
import com.develop.udaan.dto.QuizDto;
import com.develop.udaan.repository.QuestionRepository;
import com.develop.udaan.repository.QuizRepository;

@Service
public class QuizService {
	
	private static Integer QUESTIONS_PER_PAGE = 10;

	@Autowired
	private QuizRepository quizRepository;
	@Autowired
	private QuestionRepository questionRepository;
	
	public void createQuiz(HttpServletRequest request) {
		quizRepository.save(createQuizFromRequest(request));
	}
	
	public QuizDto getQuizService(HttpServletRequest request) {
		Map<String, List<String>> questionMap = new LinkedHashMap<>();
		Optional<Quiz> quiz = quizRepository.findById(request.getHeader("quizId"));
		int page = Integer.parseInt(request.getHeader("page"));
		if(quiz.isPresent()) {
			int start = QUESTIONS_PER_PAGE*(page-1);
			int end = Math.min(quiz.get().getQuestions().size(), QUESTIONS_PER_PAGE*page);
			for(int i=start; i<end; i++) {
				Optional<Question> question = questionRepository.findById(quiz.get().getQuestions().get(i));
				if(question.isPresent()) {
					questionMap.put(question.get().getQuestionString(), question.get().getOptions());
				}
			}
			return new QuizDto(quiz.get().getTitle(), questionMap);
		}
		return null;
	}
	
	private Quiz createQuizFromRequest(HttpServletRequest request) {
		return new Quiz(request.getHeader("title"), Arrays.asList(request.getHeader("questionIds").split(",")));
	}
}
