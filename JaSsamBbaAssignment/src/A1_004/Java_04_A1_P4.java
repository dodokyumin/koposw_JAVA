package A1_004;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_04_A1_P4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.printf("#Menu\n1. Encryption\n2. Decryption\n-> ");

			int inputType = sc.nextInt();
			String inputStr = sc.next();
			inputStr.toCharArray();
			char[] inputStrArr = inputStr.toCharArray();
			ArrayList<Character> StrToEncArr = new ArrayList<Character>();
			ArrayList<Character> DecToStrArr = new ArrayList<Character>();

			// Encryption
			if (inputType == 1) {

				// 낱개별 문자를 암호화
				for (int i = 0; i < inputStrArr.length; i++) {
					// StrToEncArr.add((char) (((byte) inputStrArr[i]) >> 1));
					StrToEncArr.add((char) (((byte) inputStrArr[i]) - 15));

				}
				String enc = "";
				for (Character item : StrToEncArr) {
					enc += item;
				}
				System.out.println("Result : " + enc);

				// Decryption
			} else if (inputType == 2) {

				for (int i = 0; i < inputStrArr.length; i++) {
					// DecToStrArr.add((char) (byte) (((char) inputStrArr[i]) << 1));
					DecToStrArr.add((char) (byte) (((char) inputStrArr[i]) + 15));
				}
				String dec = "";
				for (Character item : DecToStrArr) {
					dec += item;
				}
				System.out.println("Result : " + dec);

			}
		}
	}

}
