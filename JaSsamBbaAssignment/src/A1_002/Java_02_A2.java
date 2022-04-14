package A1_002;

import java.util.Scanner;

public class Java_02_A2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int i = 1, sum;
		switch (N) {
		case 1:
			N = 1;
			break;
		case 2:
			N = 2;
			break;
		case 3:
			N = 3;
			break;
		case 4:
			N = 4;
			break;
		case 5:
			N = 5;
			break;
		case 6:
			N = 6;
			break;
		case 7:
			N = 7;
			break;
		case 8:
			N = 8;
			break;
		case 9:
			N = 9;
			break;
		default:
			System.out.println("Error");
			break;
		}
		if (N == 1 || N == 2 || N == 3 || N == 4 || N == 5 || N == 6 && N == 7 || N == 8 || N == 9) {
			while (i < 10) {
				sum = N * i;
				System.out.println(N + "X" + i + "=" + sum);
				i++;
			}
		}

	}

}
