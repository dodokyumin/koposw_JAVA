package A1;

import java.util.ArrayList;
import java.util.Scanner;

public class A1 {
	static ArrayList<Integer> fiboArray = new ArrayList<Integer>();
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);	
		getFibo(scanner.nextInt());
		
	}
	
	public static void getFibo(int inputNum) {
		for (int i = 0; i < inputNum; i++) {

			if (i == 0) {
				fiboArray.add(0);
			} else if (i == 1 || i == 2) {
				fiboArray.add(1);
			} else {
				fiboArray.add(i, (fiboArray.get(i - 1) + fiboArray.get(i - 2)));
			}
			
		System.out.print(fiboArray.get(i) + " ");
		
		}
	}
}
