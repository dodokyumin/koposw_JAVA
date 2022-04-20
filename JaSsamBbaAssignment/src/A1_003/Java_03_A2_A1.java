package A1_003;

import java.util.Arrays;
import java.util.Scanner;

public class Java_03_A2_A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// text를 대문자로, 공백 제거
		String text = sc.nextLine().toUpperCase().replaceAll("\\s+", "");

		// 배열에 char로 저장
		char[] textArr = text.toCharArray();

		// 배열 순서 정렬
		Arrays.sort(textArr);
		// 문자열 순서 정렬
		String sortedText = new String(textArr);

		int[] amountArr = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		int found = 0;
		for (int i = 0; i < sortedText.length(); i++) {
			if(sortedText.indexOf(sortedText.charAt(i)) >= 0) {
				amountArr[i] = +1;
			}
			
		}
		
//		for (int i = 0; i < textArr.length; i++) {
//			// 연속하는 알파벳의 갯수를 배열에 번호대로 저장
//			for (int j = i + 1; j < textArr.length; j++) {
//				if (textArr[i] == textArr[j]) {
//					charAt
//					amountArr[i]++;
//
//				}
//			}
//
//		}

		for (int i = 0; i < textArr.length; i++) {
			
			System.out.println(textArr[i] + " - " + amountArr[i]);
		}

	}

}
