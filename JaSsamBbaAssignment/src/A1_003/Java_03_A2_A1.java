package A1_003;

import java.util.Arrays;
import java.util.Scanner;

public class Java_03_A2_A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// text�� �빮�ڷ�, ���� ����
		String text = sc.nextLine().toUpperCase().replaceAll("\\s+", "");

		// �迭�� char�� ����
		char[] textArr = text.toCharArray();

		// �迭 ���� ����
		Arrays.sort(textArr);
		// ���ڿ� ���� ����
		String sortedText = new String(textArr);

		int[] amountArr = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		int found = 0;
		for (int i = 0; i < sortedText.length(); i++) {
			if(sortedText.indexOf(sortedText.charAt(i)) >= 0) {
				amountArr[i] = +1;
			}
			
		}
		
//		for (int i = 0; i < textArr.length; i++) {
//			// �����ϴ� ���ĺ��� ������ �迭�� ��ȣ��� ����
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
