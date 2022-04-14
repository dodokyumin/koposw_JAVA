package A1_004;

import java.util.Scanner;
import java.util.ArrayList;

public class Java_04_A1_P3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;

		// 가변 길이를 갖는 ArrayList 배열을 사용하기
		ArrayList<Integer> multipleArr = new ArrayList<Integer>();

		for (int i = 1; i <= M; i++) {
			if (i % N == 0) {
				sum += i;
				multipleArr.add(i);
			}
		}

		System.out.println(sum + "" + multipleArr);

	}

}
