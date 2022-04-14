package Java_01;
import java.util.Scanner;
public class Main4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("Please input name.");
		name = scanner.next();
		System.out.println("name is " + name);
		
		System.out.println("Please input age.");
		age = scanner.nextInt();
		System.out.println("age is " + age);
	}

}
