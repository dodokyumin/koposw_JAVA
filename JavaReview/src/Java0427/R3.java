package Java0427;

import java.util.Scanner;

public class R3 {

   public static void main(String[] args) {

      int num1 = 0, num2 = 0;

      num1 = input(1);
      num2 = input(2);

      int frontNum = Cal1(num1, num2);
      int backNum = Cal2(num1, num2);

      printResult(frontNum, backNum);

   }

   public static int input(int i) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      return num;
   }

   public static int Cal1(int num1, int num2) {
      int frontNum = 100 - (100 - num1 + 100 - num2);
      return frontNum;
   }

   public static int Cal2(int num1, int num2) {
      int backNum = (100 - num1) * (100 -num2);
      return backNum;
   }

   public static void printResult(int frontNum, int backNum) {
      int vedicResult = frontNum * 100 + backNum;
      System.out.println("Result = " + vedicResult);
   }
}