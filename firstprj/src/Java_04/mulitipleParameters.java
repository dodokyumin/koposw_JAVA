package Java_04;

import java.util.Scanner;

public class mulitipleParameters {

	public static void addOperation(int a, int b) {
		int sum = a + b;
		System.out.println("a + b =" +sum);
	}
	public static void minOperation(int a, int b) {
		int sum = a - b;
		System.out.println("a - b =" +sum);
	}
	public static void mulOperation(int a, int b) {
		int sum = a * b;
		System.out.println("a * b =" +sum);
	}
	public static void divOperation(int a, int b) {
		int sum = 0;
		if (b == 0)
			System.out.println("cannot divide by 0");
		else {
			sum = a / b;
			System.out.println("a / b =" +sum);}
	}
	public static void remOperation(int a, int b) {
		int sum = 0;
		if (b == 0)
			System.out.println("cannot divide by 0");
		else {
			sum = a % b;
			System.out.println("a % b =" +sum);
			}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		addOperation(a, b);
		minOperation(a, b);
		mulOperation(a, b);
		divOperation(a, b);
		remOperation(a, b);
	}

}
