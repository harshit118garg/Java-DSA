package com.functions.javaPrograms;

import java.util.Scanner;

public class AnyBaseMultiply {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int b = sc.nextInt();

      int res = getMultiplication(n1, n2, b);
      System.out.println(res);
   }
   static int getMultiplication(int n1, int n2, int b) {
      int res = 0;
      res= decimalToAnyBase(anyBaseToDecimal(n1, b) * anyBaseToDecimal(n2, b), b);
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
