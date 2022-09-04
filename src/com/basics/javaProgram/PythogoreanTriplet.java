package com.basics.javaProgram;

import java.util.Scanner;

public class PythogoreanTriplet {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      int max = (a>b) ? (a>c) ? a : c : (b>c) ? b : c;

      boolean flag = false;
      if (max == a) {
         if (b*b + c*c == max*max) {
            flag = true;
         }
      } else if (max == b) {
         if (a*a + c*c == max*max) {
            flag = true;
         }
      } else {
         if (b*b + a*a == max*max) {
            flag = true;
         }
      }

      if (flag) {
         System.out.println("Pythagorean Triplet");
      } else {
         System.out.println("Not a Pythagorean Triplet");
      }
   }
}
