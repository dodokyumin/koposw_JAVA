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

		// set()메소드는 전달된 Calendar필드를 특정 값으로 설정한다. 1월은 0부터 시작, 그래서 -1
		cal.set(inputYear, inputMonth - 1, 1);

		// 입력 연 월은 몇일까지 있나요
		DayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		// 입력 연 월은 무슨 요일부터 시작하나요 일:0 월:1 화:2...
		dayOfWeek = cal.get(Calendar.DAY_OF_WEEK) - 1;

		// 첫째주 빈자리&요일 출력
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i < 7 - dayOfWeek + 1; i++) { // i(첫째날)=1, 앞 빈칸 띄고니까 +1
			System.out.print(i + "\t");
			if (i == 7 - dayOfWeek) {
				System.out.print("\n");
			}
		}

		// 나머지 둘째 주 부터 일 출력 & 줄교체
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
