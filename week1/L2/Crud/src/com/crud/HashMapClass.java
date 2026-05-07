package com.crud;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapClass {

	public static void main(String []args)throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<Object,Object> hm= new HashMap<Object ,Object>();
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
				addValue(hm,br);
			}else if(flag==2) {
				updateValue(hm,br);
			}else if(flag==3) {
				retrieveData(hm,br);
			}else if(flag==4) {
				deleteData(hm,br);
			} else if (flag==5) {
				System.out.println(hm);
			}else {
				System.out.println("Thank you !!!1");
			}
			
		}
	}

	private static void deleteData(HashMap<Object, Object> hm, BufferedReader br) throws NumberFormatException, IOException {
		if(hm.isEmpty()) {
			System.out.println("you hashmap is empty");
			return ;
		}
		System.out.println("enter  1 if want to delete single value");
		System.out.println("enter 2 if u want to delete whole hashmap");
		int flag=Integer.parseInt(br.readLine());
		if(flag!=2) {
			System.out.println("enter the  key ");
			Object key=br.readLine();
			
			hm.remove(key);
		}else {
			hm.clear();
		}
	}

	private static void retrieveData(HashMap<Object, Object> hm, BufferedReader br) throws NumberFormatException, IOException {
		
		System.out.println("Enter 1 if you want to get particular value");
		System.out.println("Entere 2 if you want to get all Data");
		int flag=Integer.parseInt(br.readLine());
	     
		if(flag==1) {
			System.out.println("Enter the key");
			Object key=br.readLine();
			if(hm.containsKey(key)) {
				Object object = hm.get(key);
			
				System.out.println(key+"   :  "+object);
			}else {
				System.out.println("key : "+key +" is not present here ");
			}
			
		}else {
			if(hm.isEmpty()){
				System.out.println("Hash/map is  empty");
			}else{
				for( Entry<Object, Object> entry :hm.entrySet()) {
					System.out.println(entry.getKey() + ": " + entry.getValue());
				}
			}
			
		}
		
	}

	private static void updateValue(HashMap hm, BufferedReader br)throws IOException {
		System.out.println("Enter the key which value u want to update ");
		Object key=br.readLine();
		System.out.println("Enter the  New value ");
		Object value=br.readLine();
		hm.put(key, value);
		System.out.println("Updated successfully !!!!!!!1");
		
	}

	private static void addValue(HashMap hm, BufferedReader br) throws IOException {
	    int flag=-1;
		do {
			System.out.println("enter the Key");
			Object key=br.readLine();
			System.out.println("Enter the value ");
			Object value=br.readLine();
		     hm.put(key,value);
		     System.out.println("Added successfully !!!!!");
			System.out.println("Enter 0 if you dont want to add more or else enter -1 ");
			flag=Integer.parseInt(br.readLine());
		}while(flag!=0);
		
	}
}
