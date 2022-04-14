package A1_003;

import java.util.Scanner;

public class Java_03_A1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0, result = 1, mean = 0, max = 0, min = 0;
		int addNum = 0;

		while (true) {

			num = sc.nextInt();
			// 입력값 출력
			addNum = addNum + num;

			// 총 합 addNum에서 평균값 구하기(정수형으로)
			mean = addNum / result;

			// max값 구하기
			max = (num > max) ? num : max;

			// min값 구하기 (첫 min값은 0이므로 첫min에게만 num 부여
			min = (min == 0) ? num : min;
			min = (num < min) ? num : min;

			System.out.println("Result : " + result + " - Mean " + mean + ", Max " + max + ", Min " + min);
			result++;
		}

	}

}
