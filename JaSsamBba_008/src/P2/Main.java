package P2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		while (true) {
			getCentre(setUserInput());
			System.out.println();
		}
	}

	public static String setUserInput() {
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		return userInput;
	}

	public static void getCentre(String userInput) {
		int length = userInput.length();
		if (length % 2 == 0)
			System.out.println(userInput.substring((length / 2) - 1, (length / 2) + 1));
		else
			System.out.println(userInput.substring((length / 2), (length / 2) + 1));
	}

}