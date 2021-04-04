package com.develop.udaan.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Question {

	@Id
	private String id;
	private String questionString;
	private List<String> options;
	private List<String> correctOptions;
	
	public Question() {
		
	}
	
	public Question(String id, String questionString, List<String> options, List<String> correctOptions) {
		super();
		this.id = id;
		this.questionString = questionString;
		this.options = options;
		this.correctOptions = correctOptions;
	}
	
	public Question(String questionString, List<String> options, List<String> correctOptions) {
		super();
		this.questionString = questionString;
		this.options = options;
		this.correctOptions = correctOptions;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getQuestionString() {
		return questionString;
	}
	public void setQuestionString(String questionString) {
		this.questionString = questionString;
	}
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}
	public List<String> getCorrectOptions() {
		return correctOptions;
	}
	public void setCorrectOptions(List<String> correctOptions) {
		this.correctOptions = correctOptions;
	}
	
}
