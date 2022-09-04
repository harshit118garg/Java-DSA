package com.basics.javaProgram;

import java.util.Scanner;

public class PrimeNumberInARange {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter range...........");
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println("Prime Numbers between "+a+" and "+b+" ......");

      int count = 0;
      for (int i = a; i <= b; i++) {
         if (checkPrime(i)) {
            count++;
            System.out.print(i+" ");
         }
      }
      System.out.println();
      System.out.println("Total Prime numbers in the given range are..."+count);
   }
   public static boolean checkPrime (int n) {
      if (n <= 1) return false;

      else if (n == 2) return true;

      else if (n % 2 == 0) return false;

      for (int i = 3; i < Math.sqrt(n); i++) {
         if (n % i == 0)   return false;
      }

      return true;
   }
}
