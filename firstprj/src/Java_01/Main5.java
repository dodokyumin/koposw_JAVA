package Java_01;
import java.util.Scanner;
public class Main5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		
		System.out.println("Input the 1st number!");
		a = scanner.nextInt();
		System.out.println("Input the 2st number!");
		b = scanner.nextInt();
		
		System.out.printf("Result : %d + %d = %d",a,b,a+b);
	}

}
