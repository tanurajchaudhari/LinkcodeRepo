package com.bank;

import com.bank.exception.InsufficientBalanceException;

public class CurrentAccount extends Account {
	CurrentAccount(String holderName, double balance) {
		super(holderName, balance);
		
	}

	static double overdraftLimit = 5000;

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
	
		if(balance + overdraftLimit < amount){

		    throw new InsufficientBalanceException(
		        "Overdraft limit exceeded"
		    );
		}else {
			System.out.println("Amount before withdraw is "+ balance );
			balance = balance - amount;
			System.out.println("Amount is withdraw successfully from currentAccount  and  new balance is  "+ balance );
		}
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Account number is "+accountNumber);
		System.out.println("Account holder name  is "+ holderName);
		System.out.println("Balace is : -"+ balance );
		
	}



}
