package A1_003;

import java.util.Scanner;

public class Java_03_A1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
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

			System.out.println("Result : " + result + " - Mean " + mean + ", Max " + max + ", Min " + min);
			result++;
		}

	}

}
