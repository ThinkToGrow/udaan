package com.develop.udaan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.develop.udaan.document.HelloUdaan;

@Repository
public interface HelloUdaanRepository extends MongoRepository<HelloUdaan, Integer>{

}
