package java_011;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int Num1 =  sc.nextInt();
		int Num2 =  sc.nextInt();
		
		int Bigger = Num1 > Num2 ? Num1 : Num2;
		
		System.out.println(Bigger);

	}

}
