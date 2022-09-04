package com.basics.javaProgram;

import java.util.Scanner;

public class PrimeNumber {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int t = sc.nextInt();
      for (int i = 0; i < t; i++) {
         int n = sc.nextInt();

         if (isPrime(n)) {
            System.out.println("Prime");
         } else {
            System.out.println("Not Prime");
         }
      }
   }

   public static boolean isPrime(int n) {
      if (n <= 1) return false;

      else if (n == 2) return true;

      else if (n % 2 == 0) return false;

      for (int i = 3; i <= Math.sqrt(n); i++) {
         if (n % i == 0) return false;
      }

      return true;
   }
}
