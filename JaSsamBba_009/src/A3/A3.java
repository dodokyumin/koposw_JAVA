package A3;

import java.util.ArrayList;
import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> strArr = new ArrayList<String>();
		int num = 0, result = 1, mean = 0, max = 0, min = 0;
		int addNum = 0;

		while (true) {

			num = sc.nextInt();
			// �Է°� ���
			addNum = addNum + num;

			// �� �� addNum���� ��հ� ���ϱ�(����������)
			mean = addNum / result;

			// max�� ���ϱ�
			max = (num > max) ? num : max;

			// min�� ���ϱ� (ù min���� 0�̹Ƿ� ùmin���Ը� num �ο�
			min = (min == 0) ? num : min;
			min = (num < min) ? num : min;
			
			strArr.add("Result : " + result + " - Mean " + mean + ", Max " + max + ", Min " + min);
			System.out.println(strArr);
			result++;
			strArr.clear();
		}

	}

}
