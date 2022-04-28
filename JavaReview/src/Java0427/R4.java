package Java0427;

import java.util.Scanner;

public class R4 {

   public static void main(String[] args) {

      String num1 = "0", num2 = "0";

      num1 = input(1);
      num2 = input(2);

      int frontNum = Cal1(num1, num2);
      int backNum = Cal2(num1, num2);

      printResult(frontNum, backNum);

   }

   public static String input(int i) {
      Scanner sc = new Scanner(System.in);
      String num = sc.nextLine();
      return num;
   }

   public static int Cal1(String num1, String num2) {
      int frontNum = Integer.parseInt("100")
            - (Integer.parseInt("100") - Integer.parseInt(num1) + Integer.parseInt("100") - Integer.parseInt(num2));
      return frontNum;
   }

   public static int Cal2(String num1, String num2) {
      int backNum = (Integer.parseInt("100") - Integer.parseInt(num1))
            * (Integer.parseInt("100") - Integer.parseInt(num2));
      return backNum;
   }

   public static void printResult(int frontNum, int backNum) {
      int vedicResult = frontNum * 100 + backNum;
      System.out.println("Result = " + vedicResult);
   }
}