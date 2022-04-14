package Java_02;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("What number do you want?");
		int inputNum = scanner.nextInt();
		int sum;
		for (int i = 1; i < 10; i++) {
			sum = inputNum * i;
			System.out.println(inputNum + " X " + i + " = " + sum);
		}
	}

}
