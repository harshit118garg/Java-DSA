package com.functions.javaPrograms;

import java.util.Scanner;

public class decimalToAnyBase {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int b = sc.nextInt();
      int res = decimalToBaseN(n, b);
      System.out.println(res);
   }

   static int decimalToBaseN(int n, int b) {
      int res = 0;
      int pow = 0;
      while (n > 0) {
         int rem = n % b;
         res += rem * Math.pow(10, pow);
         pow++;
         n /= b;
      }
      return res;
   }
}
