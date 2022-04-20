package Java_02;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		int i = 0;
		
		while(true) {
			System.out.println(i);
			i++;
			if(i>100) {
				break;
			}
		}
	}

}
