package java_009;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class P03 {

	public static void main(String[] args) {
		Queue<Integer> ranNum = new LinkedList<Integer>();

		//2�� ��� ���� ����
		for (int i = 1; i <= 10; i++) {
			int ran = (int) (Math.random() * 31);

			if (ran % 2 == 0) {
				i--;
			} else {
				ranNum.offer(ran);
			}
		}
		System.out.println(ranNum);

		//3�� ����� ���
		for (int i = 0; i < 10; i++) {

			if (ranNum.peek() % 3 == 0) {
				System.out.print(ranNum.peek() + " ");
				ranNum.remove();
				
			} else {
				ranNum.remove();
				
			}

		}

	}
}
