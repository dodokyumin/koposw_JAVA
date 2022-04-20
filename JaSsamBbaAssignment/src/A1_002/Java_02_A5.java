package A1_002;

import java.util.Scanner;

public class Java_02_A5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		System.out.println(N);

		for (int i = 0; i <= N; i++) { // i = 012345

			int k = 1;
			while (k <= i) {
				System.out.printf(" ");
				k++;
			}

			for (int j = (N * 2 - 2); j >= 2 * i; j--) { // 8>=0,7,6,5,4,3,2,1,0 รั 9น๘
				System.out.printf("*");
			}

			System.out.printf("\n");
		}

	}

}
