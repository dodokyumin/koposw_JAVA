package A1_005;

import java.util.Scanner;

public class Java_05_A1_P4 {
	static int n1=0, n2=1, n3=0; 
	static StringBuilder FiboSt = new StringBuilder();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();    
		System.out.print(n1+" "+n2);  
		Fibonacci(count-2);
		 
	}
	
	public static void Fibonacci(int a) {

		if(a>0){    
			n3 = n1 + n2;   //n3 = 0 + 1   //n3 = 1+1  //n3 = 1+2   //n3 = 3+2   //n3 = 3+5
		    n1 = n2;    	//n1 = 1		//n1 = 1   //n1 = 2     //n1 = 3     //n1 = 5
		    n2 = n3;    	//n2 = 1		//n2 = 2   //n2 = 3     //n2 = 5     //n2 = 8
		    System.out.print(" "+n3);   //1
		    Fibonacci(a-1);
		     }    
		 }    
	}