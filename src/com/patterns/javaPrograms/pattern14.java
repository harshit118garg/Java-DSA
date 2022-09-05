package com.patterns.javaPrograms;

import java.util.Scanner;

public class pattern14 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int row = 10;
      for (int i = 1; i <= row; i++) {
         System.out.println(n+" x "+i+" = "+(n*i));
      }
   }
}
