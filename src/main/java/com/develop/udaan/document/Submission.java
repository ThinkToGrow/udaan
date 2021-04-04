package com.develop.udaan.document;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Submission {
	
	@Id
	private String id;
	private String studentId;
	private String quizId;
	private Map<String, List<String>> responses;
	
	public Submission(String id, String studentId, String quizId, Map<String, List<String>> responses) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.quizId = quizId;
		this.responses = responses;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getQuizId() {
		return quizId;
	}
	public void setQuizId(String quizId) {
		this.quizId = quizId;
	}
	public Map<String, List<String>> getResponses() {
		return responses;
	}
	public void setResponses(Map<String, List<String>> responses) {
		this.responses = responses;
	}

}
