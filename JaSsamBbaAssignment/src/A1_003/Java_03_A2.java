package A1_003;

import java.util.Arrays;
import java.util.Scanner;

public class Java_03_A2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String text = sc.nextLine().toUpperCase().replaceAll("\\s+", "");

		char[] textArr = text.toCharArray();

		Arrays.sort(textArr);
		String sortedText = new String(textArr);

		int count = 1;

//		for (int i = 0; i < sortedText.length(); i++) {
//			int j = i + 1;
//			if (StringUtils.isEmpty(sortedText.charAt(i + 1))) {
//
//				if (sortedText.charAt(i) == sortedText.charAt(i + 1)) {
//
//					count++;
//
//				} else {
//					System.out.println(sortedText.charAt(i) + " - " + count);
//					count = 1;
//				}
//
//			} else {
//				System.out.println(sortedText.charAt(i) + " - " + count);
//			}
//		}
	}
}


