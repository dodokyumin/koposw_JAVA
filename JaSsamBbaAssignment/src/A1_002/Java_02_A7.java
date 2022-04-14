package A1_002;

import java.util.Scanner;

public class Java_02_A7 {

	public static void main(String[] args) {
//		Find the LCM(Least Common Multiple)
//		User inputs the two numbers, N and M
//		Print the LCM

		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int max = (num1 > num2) ? num1 : num2;
		int mul = num1 * num2;
		int LCM = 0;

		for (int i = max; i <= mul; i++) {
			if (i % num1 == 0 && i % num2 == 0) {
				LCM = i;
				break;
			}
		}
		System.out.println(LCM);
	}

}
