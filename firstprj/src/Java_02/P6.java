package Java_02;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What operation do you want?\n1. +\n2. -\n3. *\n4. /\n--->\n");

		int Oper = scanner.nextInt();
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int sum = 0;

		/*
		 * System.out.println("Operator number : "+ Oper); System.out.println("num1 : "+
		 * num1); System.out.println("num2 : "+ num2);
		 */

		if (Oper == 1) {
			sum = num1 + num2;
		} else if (Oper == 2) {
			sum = num1 - num2;
		} else if (Oper == 3) {
			sum = num1 * num2;
		} else if (Oper == 4 && num2 != 0) {
			sum = num1 / num2;
		} else {
			System.out.println("ERROR");
		}
		if (Oper != 5) {
			System.out.println(sum);
		}
	}

}
