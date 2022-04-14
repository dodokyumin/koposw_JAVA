package Java_03;

import java.util.Calendar;
import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();

		int inputYear = scanner.nextInt();
		int inputMonth = scanner.nextInt();
		int DayOfMonth, dayOfWeek;
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

		// set()�޼ҵ�� ���޵� Calendar�ʵ带 Ư�� ������ �����Ѵ�. 1���� 0���� ����, �׷��� -1
		cal.set(inputYear, inputMonth - 1, 1);

		// �Է� �� ���� ���ϱ��� �ֳ���
		DayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		// �Է� �� ���� ���� ���Ϻ��� �����ϳ��� ��:0 ��:1 ȭ:2...
		dayOfWeek = cal.get(Calendar.DAY_OF_WEEK) - 1;

		// ù°�� ���ڸ�&���� ���
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i < 7 - dayOfWeek + 1; i++) { // i(ù°��)=1, �� ��ĭ ���ϱ� +1
			System.out.print(i + "\t");
			if (i == 7 - dayOfWeek) {
				System.out.print("\n");
			}
		}

		// ������ ��° �� ���� �� ��� & �ٱ�ü
		int secWeekFirst = 8 - dayOfWeek;
		int count = 1;
		while (secWeekFirst < DayOfMonth) {
			System.out.print(secWeekFirst + "\t");
			if (count % 7 == 0) {
				System.out.print("\n");
			}
			count++;
			secWeekFirst++;
		}

	}

}
