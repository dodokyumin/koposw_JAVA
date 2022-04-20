package java_009;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class P3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack<String> inputStrQ = new Stack<String>();
		String[] inputStrArr = sc.nextLine().split(" ");

		for (String a : inputStrArr) {
			inputStrQ.add(a);
		}

		String userInput = sc.nextLine();

		for (int i = 0; i < inputStrArr.length; i++) {

			if (inputStrQ.peek().equals(userInput)) {
				System.out.println(i + 1);
				break;
			} else
				inputStrQ.pop();

		}

	}

}
