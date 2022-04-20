package Java_04;

import java.util.Scanner;

public class P5 {
	
	public static void gugu (int inputNum) {
	int sum;
		for (int i = 1; i < 10; i++) {
			sum = inputNum * i;
			System.out.println(inputNum + " X " + i + " = " + sum);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What number do you want?");
		int inputNum = scanner.nextInt();
		gugu(inputNum);
		
	
	}
}


