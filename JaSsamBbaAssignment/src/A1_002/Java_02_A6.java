package A1_002;

import java.util.Scanner;

public class Java_02_A6 {

	public static void main(String[] args) {
		/*
		 * Find the Factors of N User inputs a number, N Print the factors of N
		 */

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int factors;
		
		for (int i = 1; i < N; i++) {
			if (N % i == 0) {
				factors = i;
				System.out.println(factors);
			}
		}

	}

}
