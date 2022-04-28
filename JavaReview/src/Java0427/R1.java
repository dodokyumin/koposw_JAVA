package Java0427;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class R1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();
		String line3 = sc.nextLine();
		sc.close();
		
		int num1 = Integer.parseInt(line1);
		int num2 = Integer.parseInt(line2);
		int num3 = Integer.parseInt(line3);
		int sumOne = num1%10 + num2%10 + num3%10;
		int sum1All = num1/1000 + num1%1000/100 + num1%100/10 + num1%10;
		int sum2All = num2/1000 + num2%1000/100 + num2%100/10 + num2%10;
		int sum3All = num3/1000 + num3%1000/100 + num3%100/10 + num3%10;
		
		String[] Arr1 = line1.split("");
		String[] Arr2 = line2.split("");
		String[] Arr3 = line3.split("");

		String output = "";
		
		for (int i=0; i<Arr1.length; i++){
			if(Arr1[i].equals(Arr2[i])&& Arr2[i].equals(Arr3[i])) {
				output = "PASS";
				break;
			}
			if(sumOne != 3 && sumOne != 0) {
				output = "FAIL";
				break;
			}

		}
		if(sum1All == 0 || sum1All == 4 || sum2All == 0 || sum2All == 4 || sum3All == 0 || sum3All == 4) {
			output = "PASS";
		}	
		
		System.out.println(output);

	}

}
