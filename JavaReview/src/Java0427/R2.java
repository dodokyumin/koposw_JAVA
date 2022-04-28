package Java0427;

import java.util.Date;
import java.util.Scanner;

public class R2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
	      int intAge , korAge;
	      int currentYear = 1900 + date.getYear();
	      int currentDay = (date.getMonth()+1)*100 + date.getDate();      
	      
	      Scanner sc = new Scanner (System.in);
	      System.out.println("Input birthday : ");
	      int inputNum = sc.nextInt();
	      
	      int inputYear = inputNum/10000;
	      int inputDay = inputNum%10000;
	      
	      if (inputDay <= currentDay) {
	         intAge = currentYear - inputYear;
	         korAge = currentYear - inputYear +1;
	      } else {
	         intAge = currentYear - inputYear -1;
	         korAge = currentYear - inputYear +1;
	      }
	      
	      System.out.println("International Age : " + intAge);
	      System.out.println("Korean Age : " + korAge);
	}

}
