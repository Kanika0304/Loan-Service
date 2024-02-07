package com.learning.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.learning.document.LoanDocument;

public interface LoanRepo extends MongoRepository<LoanDocument, Integer>{

}
