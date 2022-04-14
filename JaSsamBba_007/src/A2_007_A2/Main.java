package A2_007_A2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] nArr = new int[N];
		int[] mArr = new int[M];

		for (int i = 0; i < N; i++) {
			nArr[i] = i + 1;
		}
		for (int i = 0; i < M; i++) {
			mArr[i] = i + 1;
		}

		for (int i = 1; i < nArr.length + 1; i++) {
			for (int j = 1; j < mArr.length + 1; j++) {
				System.out.println(i + "," + j);
			}
		}

	}

}
