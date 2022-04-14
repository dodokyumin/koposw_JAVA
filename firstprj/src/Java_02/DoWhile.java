package Java_02;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		do {
			System.out.println(i);
			i++;
		}while (i <= 0);
	}

}
