package A1_002;

import java.util.Scanner;

public class Java_02_A4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		System.out.println(N);

		for (int i = 0; i <= N; i++) { // i = 12345
			for (int k = N; 0 < k - i; k--) {
				System.out.printf(" ");

			} 

			for (int k = 0; k <= 2 * i; k++) { // i = 2 4 6 8 10
				System.out.printf("*");
			}
			System.out.printf("\n");
		}

	}

}
