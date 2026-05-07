package com.crud;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class HashSetClass {

	public static void main(String[]args) throws IOException {
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<Object> hs= new HashSet<>();
		int flag=-1;
		while(flag!=0) {
			System.out.println("Choose below option for operations : - ");
			System.out.println("Enter 1  to add");
			System.out.println("Enter 2  to update");
			System.out.println("Enter 3  to retriev");
			System.out.println("Enter 4  to delete");
			System.out.println("Enter 5  to show");
			System.out.println("Enter 0  to end the code ");
			
			flag= Integer.parseInt(br.readLine());
			if(flag==1) {
				addValue(hs,br);
			}else if(flag==2) {
				updateValue(hs,br);
			}else if(flag==3) {
				retrieveData(hs,br);
			}else if(flag==4) {
				deleteData(hs,br);
			} else if (flag==5) {
				System.out.println(hs);
			}else {
				System.out.println("Thank you !!!1");
			}
			
		}
	}

	private static void deleteData(HashSet<Object> hs, BufferedReader br) throws IOException {
		if(hs.isEmpty()) {
			System.out.println("HashSet is empty !!");
			return ;
		}
		System.out.println("enter  1 if want to delete single value");
		System.out.println("enter 2 if u want to delete whole hashmap");
		int flag=Integer.parseInt(br.readLine());
		if(flag!=2) {
			System.out.println("enter the  value");
			Object value=br.readLine();
			
			if(hs.contains(value)) {
				hs.remove(value);
				System.out.println(value+"  value is deleted  succssfully !!!");
			}else {
				System.out.println("Data is not present ");
			}
		}else {
		  hs.clear();
		  System.out.println("HashSet crea successfully  ");
		}
		
	}

	private static void retrieveData(HashSet<Object> hs, BufferedReader br) {
		if(hs.isEmpty()) {
			System.out.println("HashSet is empty !!");
			return;
		}else {
			  for (Object obj : hs) {
		            System.out.println(obj);
		        }
		}
		
	}

	private static void updateValue(HashSet<Object> hs, BufferedReader br) throws IOException {
		if(hs.isEmpty()) {
			System.out.println("HashSet is empty !!!");
			return;
		}else {
			System.out.println("Enter the  old value  you wna to change");
			Object old=br.readLine();
			if(hs.contains(old)) {
				hs.remove(old);
				System.out.println("value is deleted ");
				System.out.println("Enter new value ");
				Object newValue=br.readLine();
				hs.add(newValue);
			}else {
				System.out.println("data is not present");
			}
		}
		
	}

	private static void addValue(HashSet<Object> hs, BufferedReader br) throws IOException {
		// TODO Auto-generated method stub
		int flag=-1;
		do {
		
			System.out.println("Enter the value ");
			Object value=br.readLine();
		     hs.add(value);
		     System.out.println("Added successfully !!!!!");
			System.out.println("Enter 0 if you dont want to add more or else enter -1 ");
			flag=Integer.parseInt(br.readLine());
		}while(flag!=0);
		
	}
}
