package P1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			String inputNums1 = sc.nextLine();
			String inputNums2 = sc.nextLine();
			
			//convert first string to double array1
			String[] num1Arr = inputNums1.split(" ");
			double[] num1DouArr = new double[num1Arr.length];
			for (int i = 0; i < num1Arr.length; i++) {
				num1DouArr[i] = Double.parseDouble(num1Arr[i]);
			}
			
			//convert Second string to double array2
			String[] num2Arr = inputNums2.split(" ");
			double[] num2DouArr = new double[num2Arr.length];
			for (int i = 0; i < num2Arr.length; i++) {
				num2DouArr[i] = Double.parseDouble(num2Arr[i]);
			}

			findDuplicate(num1DouArr, num2DouArr);
		}
	}

	public static void findDuplicate(double[] num1DouArr, double[] num2DouArr) {
		for (int i = 0; i < num1DouArr.length; i++) {
			for (int j = 0; j < num2DouArr.length; j++) {
				if (num1DouArr[i] == num2DouArr[j]) {
					System.out.print(num1DouArr[i] + " ");
					break;
				}
			}
		}
		System.out.println();
	}

}
