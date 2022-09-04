package com.basics.javaProgram;

import java.util.Scanner;

public class InverseOfANumber {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int inverse = 0;
      int originalPosition = 1;

      while (n != 0) {
         int originalDigit = n % 10;
         int invertedDigit = originalPosition;
         int invertedPosition = originalDigit;

         inverse += invertedDigit * (int)Math.pow(10, invertedPosition - 1);

         n /= 10;
         originalPosition++;
      }

      System.out.println(inverse);
   }
}
