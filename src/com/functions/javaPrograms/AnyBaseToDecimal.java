package com.functions.javaPrograms;

import java.util.Scanner;

public class AnyBaseToDecimal {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int b = sc.nextInt();
      int res = anyBaseToDecimal(n, b);
      System.out.println(res);
   }

   static int anyBaseToDecimal (int n, int b) {
      int res = 0;
      int pow = 0;
      while (n > 0) {
         int rem = n % 10;
         res += rem * Math.pow(b, pow);
         pow++;
         n /= 10;
      }
      return res;
   }
}
