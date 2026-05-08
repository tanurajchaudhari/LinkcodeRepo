package com.bank;

import com.bank.exception.InsufficientBalanceException;

public class SavingAccount extends Account{
	

	SavingAccount(String holderName, double balance) {
		super(holderName, balance);
	
	}

	@Override
	public void deposite(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Account  balance is : -"+ balance);
		balance=balance+amount;
		System.out.println("Account balance after addint "+amount+ "  is :- "+ balance);
		return ;
		
	}

	@Override
	public void withdraw(double amount) throws InsufficientBalanceException {
	   
		if(balance-amount<1000) {
			
			throw new InsufficientBalanceException("Minimum balance required in account 1000");
			
		}else {
			System.out.println("Amount before withdraw is "+ balance );
			balance = balance - amount;
			System.out.println("Amount is withdraw successfully and  new balance is  "+ balance );
			
		}
		
	}

	@Override
	public void checkBalance() {
		System.out.println("Account number is "+accountNumber);
		System.out.println("Account holder name  is "+ holderName);
		System.out.println("Balace is : -"+ balance );
		   
	}

}
