package Java_03;

import java.util.Arrays;
import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();

		// ����� �ܾ �迭�� ����
		String[] textArr = text.split(" ");

		//�迭�� �� ��ұ��� �ȱ�
		for (int i = 0; i < textArr.length; i++) {

			// "a"�� �����ִ� �迭�� �ε���
			int a = Arrays.asList(textArr).indexOf("a");

			// "a"������ ���� �ܾ��� ù��° ���ĺ�
			String b = textArr[a + 1].substring(0, 1);

			// b�� �����̸� a��° ��Ҹ� "an"���� �ٲ�
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

