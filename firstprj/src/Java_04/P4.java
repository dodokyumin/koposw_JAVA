
package Java_04; 

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {

		input();

		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		
		
		System.out.println(calculation(input));

	}

	public static void input() {

		System.out.println("Input the equation : ");

	}

	public static double calculation(String input) {

		String[] equString = input.split("");

		String listOper = "+-*/";

		String a = "";

		String b = "";

		String oper = "";

		for (int i = 0; i < equString.length; i++) {

			for (int j = 1; j <= listOper.length(); j++) {

				if (equString[i].equals(listOper.substring(j - 1, j))) {

					a = input.substring(0, i);

					b = input.substring(i + 1, input.length());

					oper = listOper.substring(j - 1, j);

				}

			}

		}

		if (oper.contains("+")) {

			return addOperation(Double.parseDouble(a), Double.parseDouble(b));
			
		} else if (oper.contains("-")) {

			return subOperation(Double.parseDouble(a), Double.parseDouble(b));

		} else if (oper.contains("*")) {

			return mulOperation(Double.parseDouble(a), Double.parseDouble(b));

		} else if (oper.contains("/")) {

			return divOperation(Double.parseDouble(a), Double.parseDouble(b));

		}
		return 0;
		

	}

	public static double addOperation(double a, double b) {

		double sum = a + b;
		return sum;

	}

	public static double subOperation(double a, double b) {

		double sum = a - b;

		return sum;

	}

	public static double mulOperation(double a, double b) {

		double sum = a * b;

		return sum;

	}

	public static double divOperation(double a, double b) {

		double sum = a / b;

		return sum;

	}

}