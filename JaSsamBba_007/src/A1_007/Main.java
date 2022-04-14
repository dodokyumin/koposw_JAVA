package A1_007;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			String inputSentence = sc.nextLine();
			String[] inputSentenceArr = inputSentence.split("");
			String inputChar = sc.next();
	
			for (int i = 0; i < inputSentenceArr.length; i++) {
				if (inputSentenceArr[i].contains(inputChar)) {
					System.out.println(i + 1);
					break;
				}
			}
		}
	}
}
