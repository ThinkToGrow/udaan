package com.develop.udaan.dto;

import java.util.List;
import java.util.Map;

public class QuizDto {
	
	private String title;
	private Map<String, List<String>> questionMap;
	
	public QuizDto(String title, Map<String, List<String>> questionMap) {
		super();
		this.title = title;
		this.questionMap = questionMap;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Map<String, List<String>> getQuestionMap() {
		return questionMap;
	}
	public void setQuestionMap(Map<String, List<String>> questionMap) {
		this.questionMap = questionMap;
	}
	
	

}
