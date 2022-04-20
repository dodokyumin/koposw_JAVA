package Java_04;

import java.util.Scanner;

public class P3 {
	public static final String FathersName = "abuji";
	public static final String MothersName = "omoni";
	public static final String SonsName = "uriadul";
	public static final String DaughtersName = "uriddal";
	
	public static void showMenu ( ) {
		System.out.println("#Printing a Name\n1. Father\n2. Mother\n3. Son\n4. Daughter");
		System.out.printf("-> ");
	}
	
	public static void addition(int FamilyMember) {
		if (FamilyMember==1)
			System.out.println(FathersName+"\n");
		else if (FamilyMember==2)
			System.out.println(MothersName+"\n");
		else if (FamilyMember==3)
			System.out.println(SonsName+"\n");
		else if (FamilyMember==4)
			System.out.println(DaughtersName+"\n");
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
