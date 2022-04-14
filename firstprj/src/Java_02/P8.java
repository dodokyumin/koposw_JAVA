package Java_02;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What number do you want?");
		int sum, inputNum = 0;
		
		switch(scanner.nextInt()) {
		case 2 : 
			inputNum = 2;
		case 3 : 
			inputNum = 3;
		case 4 : 
			inputNum = 4;
		case 5 : 
			inputNum = 5;
		case 6 : 
			inputNum = 6;
		case 7 : 
			inputNum = 7;	
		case 8 : 
			inputNum = 8;	
		case 9 : 
			inputNum = 9;	
		default : 
			System.out.println("type 2 to 9");
		}
		for (int i = 1; i < 10; i++) {
			sum = inputNum * i;
			System.out.println(inputNum + " X " + i + "=" + sum);
		}
		
	}

}
