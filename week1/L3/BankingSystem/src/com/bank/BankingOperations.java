package com.bank;

import com.bank.exception.InsufficientBalanceException;

public interface BankingOperations {
	
	void deposite(double amount);
	
	void withdraw(double amount) throws InsufficientBalanceException;
	
	void checkBalance();

}
