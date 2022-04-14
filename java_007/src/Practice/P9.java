package Practice;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();

		String[] userInputArr = userInput.split(" ");

		for (int i = 0; i < userInputArr.length; i++) {
			System.out.println(userInputArr[i]);
		}

	}

}
