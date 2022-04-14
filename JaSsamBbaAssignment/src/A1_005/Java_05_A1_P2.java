package A1_005;

import java.util.Scanner;

public class Java_05_A1_P2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();

		printResult(n, r);

	}

	public static int factorial(int x) {
		if (x == 1) {
			return 1;
		} else {
			return x * factorial(x - 1);
		}
	}

	public static int Combination(int x, int y) {
		return factorial(x) / ((factorial(y)) * (factorial(x - y)));
	}

	public static String printFacto(int a) {
		String str = "";
		for (int i = a; i >= 1; i--) {
			if (i == 1)
				str += i;
			else
				str += i + " X ";
		}
		return str;
	}

	public static void printResult(int n, int r) {

		System.out.println("P(" + n + "," + r + ") = " + n + "! / (" + n + "-" + r + ")! /" + r + "! = ("
				+ printFacto(n) + ") / (" + printFacto(n - r) + ") / (" + printFacto(r) + ") = " + factorial(n) + "/"
				+ factorial(n - r) + "/" + factorial(r) + " = " + Combination(n, r));

	}

}
