package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
	
	@GetMapping("/loans/{number}")
	public String getLoan(@PathVariable String number) {
		String loanDetails = "Number: "+number+", Type: car, Loan:600000, EMI: 6000, Tenure: 10";
		return loanDetails;
	}
}
