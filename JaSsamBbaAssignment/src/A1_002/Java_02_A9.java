package A1_002;

import java.util.Scanner;

public class Java_02_A9 {

	public static void main(String[] args) {
//		Find the Prime Numbers
//		User inputs a numbers, N
//		Print the prime number to N

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int k = 0;

		for (int i = 1; i <= N; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					k++;
				}
			}
			if (k == 1) {
				System.out.println(i + " ");
			}
			k = 0;
		}

	}

}
