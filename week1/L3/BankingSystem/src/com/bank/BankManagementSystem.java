package com.bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.bank.exception.InsufficientBalanceException;

public class BankManagementSystem {
	
	public static void main(String[]args) throws NumberFormatException, IOException, InsufficientBalanceException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int flag=-1;
		Bank b= new Bank();
		
		while(flag!=6) {
			System.out.println("Choose below options  :  ");
			System.out.println("press 1 for  create account  ");
			System.out.println("press 2 for deposite   :  ");
			System.out.println("press 3 for withdraw :  ");
			System.out.println("press 4 for check balance   :  ");
			//System.out.println("press 5 Display accounts  :  ");
			System.out.println("press 6 exits code  :  ");
			
			flag = Integer.parseInt(br.readLine()); 
			
			if(flag==1) {
				b.createAccount();
			}else if(flag==2) {
				b.deposite();
			}else if(flag==3) {
				b.withdraw();
			}else if(flag==4) {
				b.display();
			}else {
			System.out.println("Thak u !!!");
			return;
			}
		}
	}

}
