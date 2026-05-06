package third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
	
	public static void main(String []args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the element : ");
		int x=Integer.parseInt(br.readLine());
		int flag=-1;
		while(0!=flag) {
			System.out.println("choose one from it ");
			System.out.println("if you want to add choose below number: ");
			System.out.println("for addition  enter 1");
			System.out.println("for substraction enter 2");
			System.out.println("for multiplication enter 3");
			System.out.println("for division enter 4");
			System.out.println("for modulo enter 5");
			System.out.println("Enter for done 0");
			
			flag=Integer.parseInt(br.readLine());
			if(flag==1) {
			   
				System.out.println("Enter element for addition : ");
				int ele=Integer.parseInt(br.readLine());
				x=x+ele;
			
			}else if(flag==2) {
				System.out.println("Enter the element for substraction : ");
				int ele=Integer.parseInt(br.readLine());
				x=x-ele;
			}else if(flag==3) {
				System.out.println("Enter the element for multiplication : ");
				int ele=Integer.parseInt(br.readLine());
				x=x*ele;
			}else if(flag==4) {
				System.out.println("Enter the element for division : ");
				int ele=Integer.parseInt(br.readLine());
				x=x/ele;
				
			}else if(flag==5) {
				System.out.println("Enter the element for division : ");
				int ele=Integer.parseInt(br.readLine());
				x=x%ele;
			}
		}
		System.out.println("Answer is :- "+ x);
	}
	
	
	

}
