package com.patterns.javaPrograms;

import java.util.Scanner;

public class pattern17 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int row = n, st = 1, sp = n/2;
      for (int i = 1; i <= row; i++) {
         for (int b = 1; b <= sp; b++) {
            if (i == n/2 + 1) {
               System.out.print("*\t");
            } else {
               System.out.print("\t");
            }
         }
         for (int a = 1; a <= st; a++) {
            System.out.print("*\t");
         }

         if (i <= n/2) {
            st++;
         } else {
            st--;
         }
         System.out.println();
      }
   }
}
