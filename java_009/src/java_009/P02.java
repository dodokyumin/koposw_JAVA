package java_009;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class P02 {

	static Scanner sc = new Scanner(System.in);
	static HashSet<String> ranStr = new HashSet<String>();
	static ArrayList<String> ranStr1 = new ArrayList<String>();

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			ranStr.add(sc.nextLine());
			while (ranStr.size() == 5) {
				System.out.println(ranStr);
				break;
			}
		}
		
		for (int i = 0; i < 10; i++) {
			ranStr1.add(sc.nextLine());
			while (ranStr1.size() == 5) {
				Collections.sort(ranStr1);
				System.out.println(ranStr1);
				break;
			}
		}

	}

}
