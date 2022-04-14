package java_009;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Queue<String> inputStrQ = new LinkedList<String>();
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
				inputStrQ.remove();

		}

	}

}
