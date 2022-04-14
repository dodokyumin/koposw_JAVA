package A1_004;

import java.util.Scanner;

public class Java_04_A1_P2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int balance = 0;

		do {
			System.out.printf("#Menu\n1. Deposit\n2. Withdrawal\nBalance : " + balance + "\n-> ");

			int typeInput = sc.nextInt();
			int amountInput = sc.nextInt();

			switch (typeInput) {
			case 1:
				balance += amountInput;
				break;
			case 2:
				balance -= amountInput;
				break;
			}
		} while (true);

	}

}
