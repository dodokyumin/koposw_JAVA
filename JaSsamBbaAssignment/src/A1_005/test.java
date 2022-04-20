package A1_005;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();

		if (inputStr.substring((inputStr.length()) - 1, inputStr.length()).equals("!")) {
			int i = Integer.parseInt(inputStr.substring(0, inputStr.length() - 1));
			System.out.println(printFacto(i) + " = " + factorial(i));

		} else if (inputStr.contains("P")) {
			int whereP = inputStr.indexOf("P");
			int i = Integer.parseInt(inputStr.substring(0, whereP));
			int j = Integer.parseInt(inputStr.substring(whereP + 1, inputStr.length()));

			System.out.println(Permutation(i, j));

		} else if (inputStr.contains("C")) {

			int whereC = inputStr.indexOf("C");
			int i = Integer.parseInt(inputStr.substring(0, whereC));
			int j = Integer.parseInt(inputStr.substring(whereC + 1, inputStr.length()));
			System.out.println((Permutation(i, j)) / (factorial(j)));

		}

	}

	public static int factorial(int x) {
		if (x == 1) {
			return 1;
		} else {
			return x * factorial(x - 1);
		}
	}

	public static int Permutation(int x, int y) {
		return factorial(x) / factorial(y);
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
}
