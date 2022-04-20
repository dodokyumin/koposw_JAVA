package A1_006;

import java.util.Scanner;

public class Java_06_A1_P1 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		showMenu();
	}
	
	public static void showMenu () {
	System.out.print(">Menu\n1. Course List\n2. My Course\n-> ");
	int menuInput = sc.nextInt();
	
	if (menuInput == 1) 
		showCourse();
	else if (menuInput == 2 ) 
		showMy();
	}
	
	public static void showCourse () {
		System.out.print(">Menu\n1. Korean\n2. Math\n3. English\n4. Social Studies\n5. Science\n0. Back to Main\n-> ");
		int showcourseInput = sc.nextInt();
	}

	public static void showMy () {
		System.out.print(">My Course\n-> ");
		int showMy = sc.nextInt();
	}
}
