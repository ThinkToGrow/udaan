package com.develop.udaan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.develop.udaan.document.Submission;

@Repository
public interface SubmissionRepository extends MongoRepository<Submission, String>{

}
