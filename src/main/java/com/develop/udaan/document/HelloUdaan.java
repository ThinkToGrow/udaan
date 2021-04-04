package com.develop.udaan.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("HelloUdaan")
public class HelloUdaan {

	@Id
	String id;
	String helloUdaanString;
	
	public HelloUdaan(String id, String helloUdaanString) {
		super();
		this.id = id;
		this.helloUdaanString = helloUdaanString;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getHelloUdaanString() {
		return helloUdaanString;
	}
	
	public void setHelloUdaanString(String helloUdaanString) {
		this.helloUdaanString = helloUdaanString;
	}
	
}
