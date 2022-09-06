package com.functions.javaPrograms;

import java.util.Scanner;

public class DigitFreq {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int d = sc.nextInt();

      int count = getreq(n, d);
      System.out.println(count);
   }

   static int getreq (int n, int d) {
      int count = 0;
      while (n != 0) {
         int rem = n % 10;
         if (rem == d) count++;
         n /= 10;
      }
      return count;
   }
}
