package A3;

import java.util.Scanner;

public class A3 {

   public static void main(String[] args) {

      while (true) {
         
         int userChoice = intro();
         int comChoice = (int) (Math.random() * 3);
         
         System.out.println("input : " + switchChoice(userChoice));
         System.out.println("pc input : " + switchChoice(comChoice));

         gameJudgement(userChoice, comChoice);
         
         System.out.println();

      }
   }
   
   public static int intro () {
      Scanner sc = new Scanner (System.in);
      System.out.println("0. Rock 1. Scissors 2.Paper");
      int userChoice = sc.nextInt();
      return userChoice;
   }

   public static String switchChoice(int num) {

      String result = "";

      switch (num) {
      case (0):
         result = "Rock";
         break;
      case (1):
         result = "Scissors";
         break;
      case (2):
         result = "Paper";
         break;
      }
      return result;
   }

   public static void gameJudgement(int u, int c) {
      if (u == c) {
         System.out.println("Draw");
      } else {
         if (u == 0) {
            if (c == 1) {
               System.out.println("Win");
            } else {
               System.out.println("Lose");
            }
         } else if (u == 1) {
            if (c == 0) {
               System.out.println("Lose");
            } else {
               System.out.println("Win");
            }
         } else {
            if (c == 0) {
               System.out.println("Win");
            } else if (c == 1) {
               System.out.println("Lose");
            }
         }
      }
   }
}