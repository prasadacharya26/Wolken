package com.wolken.bank.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@GetMapping("balance")
	String balance() {
		logger.info("Balance");
		return "Rs-1000";
	}
	
	@GetMapping("deposit")
	String deposit() {
		logger.info("Credited Amount");
		return "Credit Rs-1000";
	}
	
	@GetMapping("withdraw")
	String withdraw() {
		logger.info("Debited Amount");
		return "Debit Rs-1000";
	}
	
	@GetMapping("getAccountDetails")
	String getAccountDetails() {
		logger.info("Account Details");
		return "Account No:0100001234"
				+ "IFSC Code:CNRB00001";
	}
}
