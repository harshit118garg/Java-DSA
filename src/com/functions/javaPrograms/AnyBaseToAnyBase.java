package com.functions.javaPrograms;

import java.util.Scanner;

public class AnyBaseToAnyBase {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int b1 = sc.nextInt();
      int b2 = sc.nextInt();

      int res = anyBaseToAnyBase(n, b1, b2);
      System.out.println(res);
   }
   static int anyBaseToAnyBase(int n, int b1, int b2) {
      int res = 0;
      int decimalEq = anyBaseToDecimal(n, b1);
      res = decimalToAnyBase(decimalEq, b2);
      return res;
   }
   static int anyBaseToDecimal(int n, int b) {
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
   static int decimalToAnyBase(int n, int b) {
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
