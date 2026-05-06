package second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Second {
	
	static int add() {
		return 10;
	} 
	int add(int x) {
		return 10+x;
	}
	
	int calculateFib(int x){
		if(x==1) return 0;
		if(x==2)return 1;
		int a=0;int b=1;
		
		for(int i=3;i<=x;i++) {
			System.err.println("loop "+ i);
			
			int c=a+b;
			a=b;b=c;
			System.err.println(c);
		}
		return b;
	} 
	
	public static void main(String[]args) throws IOException{
		int val=add();
		System.out.println(val);
		
		Second sc= new Second();
	    System.out.println(sc.add(12));
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter the position to find the fibonacci   element");
	    int x=Integer.parseInt(br.readLine());
	    System.out.println("Fibnoacci number at position  "+x+" is :- "+sc.calculateFib(x));
		
		
		}

}
