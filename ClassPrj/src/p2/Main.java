package p2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		chooseCha();

	}

	public static void chooseCha() {
		while (true) {
			Sub C1 = new Sub("A-minsu", 16, 5, 8);
			Sub C2 = new Sub("B-minji", 20, 6, 8);
			Sub C3 = new Sub("C-minjeong", 27, 3, 4);
			Sub C4 = new Sub("D-mina", 30);
			Sub C5 = new Sub("E-minkyu", 27, 3);

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();

			if (n == 1)
				C1.printChoose();

			else if (n == 2)
				C2.printChoose();

			else if (n == 3)
				C3.printChoose();

			else if (n == 4)
				C4.printChoose2();

			else if (n == 5)
				C5.printChoose3();
		}
	}

}
