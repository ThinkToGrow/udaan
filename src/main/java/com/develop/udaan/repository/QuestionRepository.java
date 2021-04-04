package com.develop.udaan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.develop.udaan.document.Question;

@Repository
public interface QuestionRepository extends MongoRepository<Question, String> {

}
