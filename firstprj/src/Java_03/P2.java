package Java_03;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();
		char[] chars = line.toCharArray(); // Array에 character로 저장

		// print array first to last element
		for (int i = 0; i < line.length(); i++) {
			// Upper to Lower, Lower to Upper
			if (chars[i] >= 97 && chars[i] <= 123) {
				chars[i] = (char) (chars[i] - 32);	
			} else if (chars[i] <= 91 && chars[i] >= 65) {
				chars[i] = (char) (chars[i] + 32);	
			}
			System.out.print(chars[i]);
		}
	}

}
