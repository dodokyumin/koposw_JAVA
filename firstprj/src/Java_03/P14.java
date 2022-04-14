package Java_03;

import java.util.Arrays;
import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();

		// 띄어쓰기로 단어별 배열에 저장
		String[] textArr = text.split(" ");

		//배열의 끝 요소까지 훑기
		for (int i = 0; i < textArr.length; i++) {

			// "a"가 속해있는 배열의 인덱스
			int a = Arrays.asList(textArr).indexOf("a");

			// "a"다음에 오는 단어의 첫번째 알파벳
			String b = textArr[a + 1].substring(0, 1);

			// b가 모음이면 a번째 요소를 "an"으로 바꿈
			switch (b) {
			
			case "a", "e", "i", "o", "u":
				textArr[a] = "an";
				text = String.join(" ", textArr);
				break;
				
			default:
				break;
				
			}
		}

		System.out.println(text);

	}
}

