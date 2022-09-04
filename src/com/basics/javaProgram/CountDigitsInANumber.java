package com.basics.javaProgram;

import java.util.Scanner;

public class CountDigitsInANumber {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int d = 0;
      while (n != 0) {
         n /= 10;
         d++;
      }

      System.out.println(d);

      // one liner code
      // System.out.println(Integer.toString(n).length());
   }
}
