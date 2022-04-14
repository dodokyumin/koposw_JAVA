package A1_001;
import java.util.Scanner;
public class a7_001 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		//간단한 if문 예제
		if(a > b) {
			System.out.println(a+ " is bigger than "+ b);
		}else if(a < b) {
			System.out.println(b+ " is bigger than "+ a);
		}
		
		//간단한 switch문 예제
		Scanner scanner = new Scanner(System.in);
		int month = 0;
		System.out.println("Input month : ");
		month = scanner.nextInt();

		switch (month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :   
			System.out.println("This month has 31days.");
			break;
		case 4 : case 6 : case 9 : case 11 :   
			System.out.println("This month has 30days.");
			break;
		case 2 :
			System.out.println("This month has 29days.");
			
		}
	}

}
