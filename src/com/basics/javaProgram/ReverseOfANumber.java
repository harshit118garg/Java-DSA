package com.basics.javaProgram;

import java.util.Scanner;

public class ReverseOfANumber {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      while (n != 0) {
         int d = n%10;
         n /= 10;
         System.out.println(d);
      }
   }
}
