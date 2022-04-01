import java.util.Scanner;

public class standardDeviation {

	static int sum = 0;
	static double mean, median, variance, standardDeviation;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("-> ");
		int numA = sc.nextInt();
		printList(numA);
		calVariance(numA);
	}

	public static void printList(int a) {

		if (a == 1) {

			sum += a;
			System.out.println(a);

		} else {

			sum += a;
			System.out.println(a);
			printList(a - 1);

		}

	}

	public static void calVariance(int numA) {
		double SumOfDoubleDeviation = 0;
		mean = (double) sum / (double) numA;

		for (int i = 1; i <= numA; i++) {
			SumOfDoubleDeviation += Math.pow(i - mean, 2);
		}

		variance = SumOfDoubleDeviation / numA;
		standardDeviation = Math.sqrt(variance);
		System.out.println(standardDeviation);

	}

}
