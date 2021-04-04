package com.develop.udaan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.develop.udaan.document.Quiz;

@Repository
public interface QuizRepository extends MongoRepository<Quiz, String> {

}
