package Practice;

import java.util.Scanner;
import java.util.ArrayList;

public class P7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		char[] inputStrArr = inputStr.toCharArray();
		ArrayList<Character> alphabetArr = new ArrayList<Character>();
		ArrayList<Character> revAlphabetArr = new ArrayList<Character>();

		for (char a = 'a'; a <= 'z'; a++) {
			alphabetArr.add(a);
		}

		for (char a = 'z'; a >= 'a'; a--) {
			revAlphabetArr.add(a);
		}

		for (int i = 0; i < inputStrArr.length; i++) {
			for (int j = 0; j < alphabetArr.size(); j++) {
				if (inputStrArr[i] == alphabetArr.get(j)) {
					inputStrArr[i] = revAlphabetArr.get(j);
					break;
				}
			}
		}
		System.out.println(String.valueOf(inputStrArr));

	}

}
