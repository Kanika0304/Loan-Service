package com.learning.service;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.document.LoanDocument;
import com.learning.enums.Status;
import com.learning.model.LoanRequest;
import com.learning.model.LoanResponse;
import com.learning.repository.LoanRepo;
import com.learning.utils.Converter;

@Service
public class LoanService {
	
	@Autowired
	private LoanRepo loanRepo;
	
	@Autowired
	private Converter converter;
	
	public LoanResponse create(LoanRequest loanRequest) {
		LoanResponse loanResponse = null;
		if (Objects.nonNull(loanRequest)) {
			LoanDocument loanDocument = converter.requestToEntity(loanRequest);
			loanDocument = loanRepo.save(loanDocument);
			loanResponse = converter.loanResponse(loanDocument);
		}
		return loanResponse;
	}
	
	public LoanResponse findById(Integer id) {
		LoanResponse loanResponse = null;
		Optional<LoanDocument> optionaldocument = loanRepo.findById(id);
		if (optionaldocument.isPresent()) {
			LoanDocument loanDocument = optionaldocument.get();
			loanResponse = converter.loanResponse(loanDocument);
		}
		return loanResponse;
	}
	
	public LoanResponse update(Integer id, LoanRequest loanRequest) {
		LoanResponse loanResponse = null;
		Optional<LoanDocument> optionalDocument = loanRepo.findById(id);
		if (optionalDocument.isPresent()) {
			LoanDocument loanDocument = optionalDocument.get();
			loanDocument = converter.updateEntity(loanRequest, loanDocument);
			loanDocument = loanRepo.save(loanDocument);
			loanResponse = converter.loanResponse(loanDocument);
		}
		return loanResponse;
	}
	public Status deleteById(Integer id) {
		Optional<LoanDocument> optionalDocument = loanRepo.findById(id);
		if (optionalDocument.isPresent()) {
			loanRepo.deleteById(id);
			return Status.SUCCESS;
		}
		return Status.FAILED;
	}

}
