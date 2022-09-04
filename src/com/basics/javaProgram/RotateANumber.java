package com.basics.javaProgram;

import java.util.Scanner;

public class RotateANumber {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();

      int numOfDigits = Integer.toString(n).length();
         k %= numOfDigits;
      if (k < 0) {
         k += numOfDigits;
      }

      int div = (int)Math.pow(10, k);
      int rem = n % div;
      int quo = n / div;

      int mul = rem * (int)Math.pow(10, (numOfDigits - k));

      int r = mul + quo;
      System.out.println(r);

   }
}
