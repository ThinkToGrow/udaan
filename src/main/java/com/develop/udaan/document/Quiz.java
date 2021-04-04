package com.develop.udaan.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Quiz {
	
	@Id
	private String id;
	private String title;
	private List<String> questionIds;
	
	public Quiz() {
		
	}
	
	public Quiz(String id, String title, List<String> questionIds) {
		super();
		this.id = id;
		this.title = title;
		this.questionIds = questionIds;
	}
	
	public Quiz(String title, List<String> questionIds) {
		super();
		this.title = title;
		this.questionIds = questionIds;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getQuestions() {
		return questionIds;
	}
	public void setQuestionIds(List<String> questionIds) {
		this.questionIds = questionIds;
	}

}
