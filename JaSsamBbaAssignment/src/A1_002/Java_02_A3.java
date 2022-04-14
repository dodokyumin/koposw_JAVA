package A1_002;

import java.util.Scanner;

public class Java_02_A3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		System.out.println(N);

		for (int i = 0; i <= N; i++) {
			System.out.printf("\n");
			for (int j = 0; j <= i; j++) {
				System.out.printf("*");
			}

		}

	}

}
