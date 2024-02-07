package com.learning.utils;

import org.springframework.stereotype.Component;

import com.learning.document.LoanDocument;
import com.learning.model.LoanRequest;
import com.learning.model.LoanResponse;

@Component
public class Converter {
	
	public LoanDocument requestToEntity(LoanRequest loanRequest) {
		LoanDocument loanDocument = new LoanDocument();
		loanDocument.setId(loanRequest.getId());
		loanDocument.setAmount(loanRequest.getAmount());
		loanDocument.setTerm(loanRequest.getTerm());
		loanDocument.setUid(loanRequest.getUid());
		loanDocument.setSuggestions(loanRequest.getSuggestions());
		return loanDocument;
	}
	
	public LoanResponse loanResponse(LoanDocument loanDocument) {
		LoanResponse loanResponse = new LoanResponse();
		loanResponse.setId(loanDocument.getId());
		loanResponse.setAmount(loanDocument.getAmount());
		loanResponse.setTerm(loanDocument.getTerm());
		loanResponse.setUid(loanDocument.getUid());
		loanResponse.setSuggestions(loanDocument.getSuggestions());
		return loanResponse;
	}
	
	public LoanDocument updateEntity(LoanRequest loanRequest,LoanDocument loanDocument) {
		loanDocument.setId(loanRequest.getId());
		loanDocument.setAmount(loanRequest.getAmount());
		loanDocument.setTerm(loanRequest.getTerm());
		loanDocument.setUid(loanRequest.getUid());
		loanDocument.setSuggestions(loanRequest.getSuggestions());
		return loanDocument;
	}

}
