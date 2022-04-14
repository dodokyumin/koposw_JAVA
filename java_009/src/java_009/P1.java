package java_009;


import java.util.Arrays;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String[] words = sc.nextLine().split(" ");
		
		Arrays.sort(words);

		System.out.println(Arrays.toString(words));

	}

}
