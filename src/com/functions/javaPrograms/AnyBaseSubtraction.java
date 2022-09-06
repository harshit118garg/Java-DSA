package com.functions.javaPrograms;

import java.util.Scanner;

public class AnyBaseSubtraction {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int b = sc.nextInt();

      int res = getSubtraction(n1, n2, b);
      System.out.println(res);
   }

   static int getSubtraction(int n1, int n2, int b) {
      int res = 0;
      int c = 0;
      int pow = 0;

      while (n2 > 0) {
         int d1 = n1 % 10;
         n1 /= 10;
         int d2 = n2 % 10;
         n2 /= 10;

         int d = 0;
         d2 += c;

         if (d2 >= d1) {
            c = 0;
            d = Math.abs(d2 - d1);
         } else {
            c = -1;
            d = d2 + b - d1;
         }
         res += d * Math.pow(10, pow);
         pow++;
      }
      return res;
   }
}
