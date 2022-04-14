package A1_004;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_04_A1_P5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("#1 : The string length should be over 10");
		System.out.println("#2 : The string length cannot over 20");
		System.out.println("#3 : The string should contains the character'k'");
		System.out.println(
				"#4 : The string should contains at least one of the special symbols below\n\t(special symbols : @,#,$,%,&)");
		System.out.println("#5 : The string should contains at least one number");
		do {
			System.out.printf("-> ");
			String inputPWD = sc.next();
	
			if (inputPWD.length() <= 10) {
				System.out.println("FAIL");
	
			} else if (inputPWD.length() > 20) {
				System.out.println("FAIL");
	
			} else if (!(inputPWD.contains("k"))) {
				System.out.println("FAIL");
	
			} else if (!(inputPWD.contains("@") || inputPWD.contains("#") || inputPWD.contains("$")
					|| inputPWD.contains("%") || inputPWD.contains("&"))) {
				System.out.println("FAIL");
				// matches()을 활용하여 문자열 검색
			} else if (!(inputPWD.matches(".*[0-9].*"))) {
				System.out.println("FAIL");
	
			} else {
				System.out.println("PASS");
			}
		}while(true);
	}

}
