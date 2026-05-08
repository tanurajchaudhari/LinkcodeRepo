package com.bank;

 public abstract  class Account implements BankingOperations{

	 int accountNumber;

	 String holderName;

	 double balance;
	 
	 static int nextAccountNumber = 1001;
	 Account(String holderName,double balance ){
		 this.accountNumber=nextAccountNumber++;
		 this.holderName=holderName;
		 this.balance=balance;
	 }
}
