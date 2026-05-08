package com.bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.bank.exception.InsufficientBalanceException;

public class Bank {

	ArrayList <Account>al= new ArrayList<>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	void createAccount() throws NumberFormatException, IOException {
		System.out.println("press 1 for saving account ");
		System.out.println("press 2 for current account ");
		int flag = Integer.parseInt(br.readLine());
		
		
		if(flag==1) {
			System.out.println("Enter holder name : ");
			String name =br.readLine();
			System.out.println("Enter deposite  money minimum 1000  for saving account ");
			int money=Integer.parseInt(br.readLine());
			if(money<1000) {
				System.out.println("deposite should be minimum 1000");
				return ;
			
		}
			Account acc= new SavingAccount(name,money);
			
			al.add(acc);
			System.out.println("Account number is :- "+acc.accountNumber);
			System.out.println("Account holder name  is :- "+acc.holderName);
			System.out.println("Account balance is :- "+acc.balance);
	}else {
		System.out.println("Enter holder name : ");
		String name =br.readLine();
		System.out.println("Enter deposite  money minimum 1000 for current account ");
		int money=Integer.parseInt(br.readLine());
		if(money<1000) {
			System.out.println("deposite should be minimum 1000");
			return ;
		
	}
		Account acc=new CurrentAccount(name,money);
		
		al.add(acc);
		System.out.println("Account number is :- "+acc.accountNumber);
		System.out.println("Account holder name  is :- "+acc.holderName);
		System.out.println("Account balance is :- "+acc.balance);
		
	}
	
  }
	
    void deposite() throws NumberFormatException, IOException {
    	System.out.println("enter account number ");
    	int accNo=Integer.parseInt(br.readLine());
    	Account acc=searchAccount(accNo);
    	if(acc!=null) {
    		System.out.println("Enter amount  and amount should not be negative  ");
    		int amount =Integer.parseInt(br.readLine());
     		if(amount<0)return;
     		
//    		System.out.println("Account  balance is : -"+ acc.balance);
//    		acc.balance=acc.balance+amount;
//    		System.out.println("Account balance after addint "+amount+ "  is :- "+acc.balance);
//    		return ;
    		
    		acc.deposite(amount);
    		
    		
    		
    	}else {
    	   System.out.println("Account not found ");
    	}
    	
    	
    }

    void withdraw() throws NumberFormatException, IOException, InsufficientBalanceException {
    	System.out.println("Enter the  account number :");
    	int accNo=Integer.parseInt(br.readLine());
    	Account acc=searchAccount(accNo);
    	if(acc!=null) {
    		 System.out.println("Enter amount yu want to withdraw");
    		 int amount =Integer.parseInt(br.readLine());
    		 try {
    		 acc.withdraw(amount);
    		 }catch (InsufficientBalanceException e) {
    			 System.out.println("👉 Your current balance is: " + acc.balance);
    	            System.out.println("👉 You need to maintain minimum balance of ₹1000");
    		 }
    		 
    	}else{
    		System.out.println("Account is  not found !!!");
    	}
    	
    }
    void display() throws NumberFormatException, IOException {
    	System.out.println("Enter the  account number :");
    	int accNo=Integer.parseInt(br.readLine());
    	Account acc=searchAccount(accNo);
    	if(acc!=null) {
    		System.out.println("Account is found");
    		acc.checkBalance();
    	}else {
    		System.out.println("Account is not found ");
    	}
    	
    }
	private Account  searchAccount(int accNo) {
		for(Account a:al) {
			if(a.accountNumber==accNo) {
				return a;
			}
		}
		return null;
		
		
	}
	
	
	
}