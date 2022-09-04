package com.basics.javaProgram;

import java.util.Scanner;

public class GCDandLCM {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();

      int x = a, y = b;
      // using long division method
      while (a % b != 0) {
         int rem = a % b;
         a = b;
         b = rem;
      }
      int gcd = b;
      int lcm = (x*y)/gcd;

      System.out.println(gcd+" "+lcm);
   }
}
