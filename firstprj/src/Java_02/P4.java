package Java_02;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {

		// Print the number of base 3 which is the same as the input number
		Scanner scanner = new Scanner(System.in);
		int numA;

		System.out.println("Input a number of base10 : ");
		numA = scanner.nextInt();
		System.out.println(numA % 3);
		numA = numA / 3;
		System.out.println(numA % 3);
		numA = numA / 3;
		System.out.println(numA % 3);

		
	}

}
