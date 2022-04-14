package Java_02;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		/*User inputs the two numbers which are the paid money and the change 
		Print the calculation of how many coins and bills are needed for the change*/

		Scanner scanner = new Scanner(System.in);
		int pay, price, change, tenthou, fivethou, onethou, fivehun, onehun, fifty, ten;

		System.out.println("pay : ");
		pay = scanner.nextInt();
		System.out.println("price : ");
		price = scanner.nextInt();
		change = pay - price;
		System.out.println("change : " + change);

		tenthou = change / 10000;
		fivethou = (change % 10000) / 5000;
		onethou = ((change % 10000) % 5000) / 1000;
		fivehun = (((change % 10000) % 5000) % 1000) / 500;
		onehun = ((((change % 10000) % 5000) % 1000) % 500) / 100;
		fifty = (((((change % 10000) % 5000) % 1000) % 500) % 100) / 50;
		ten = ((((((change % 10000) % 5000) % 1000) % 500) % 100) % 50) / 10;

		System.out.println("10000 - " + tenthou);
		System.out.println("5000 - " + fivethou);
		System.out.println("1000 - " + onethou);
		System.out.println("500 - " + fivehun);
		System.out.println("100 - " + onehun);
		System.out.println("50 - " + fifty);
		System.out.println("10 - " + ten);

	}

}
