package Java_04;

import java.util.Scanner;

public class P1 {
	
	public static void showMenu ( ) {
		System.out.println("#Printing a Name\n1. Father\n2. Mother\n3. Son\n4. Daughter");
		System.out.printf("-> ");
	}
	
	public static void addition(int FamilyMember) {
		if (FamilyMember==1)
			System.out.println("Anthony\n");
		else if (FamilyMember==2)
			System.out.println("Steve\n");
		else if (FamilyMember==3)
			System.out.println("Luke\n");
		else if (FamilyMember==4)
			System.out.println("Ara\n");
		else
			System.out.println("Try again\n");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			showMenu();
			int inputType = sc.nextInt();
			addition(inputType);
		}
	}

}
