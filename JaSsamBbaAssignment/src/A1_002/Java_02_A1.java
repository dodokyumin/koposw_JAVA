package A1_002;

public class Java_02_A1 {
	public static void main(String[] args) {

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 11; j++) {
				int sum = 0;
				sum = i * j;
				if (j == 10) {
					System.out.printf("\n");
					break;
				}
				System.out.println(i + "X" + j + "=" + sum);
			}
		}

	}

}
