package Practice;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		String[] userInputArr = userInput.split("");
		String inputChar = sc.next();
		int count = 0;

		for (int i = 0; i < userInputArr.length - 1; i++) {
			if (userInputArr[i].contains(inputChar)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
