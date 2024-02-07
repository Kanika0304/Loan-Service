package com.learning.document;

import java.time.LocalDate;

public class Suggestion {

	private int amount;
	private int term;
	private int monthlyPayment;
	private double interestRate;
	private int aprRate;
	private LocalDate dueDate;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public int getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(int monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getAprRate() {
		return aprRate;
	}

	public void setAprRate(int aprRate) {
		this.aprRate = aprRate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

}
