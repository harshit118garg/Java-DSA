package com.patterns.javaPrograms;

import java.util.Scanner;

public class pattern19 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int row = n, col = n;

      for (int i = 1; i <= row; i++) {
         for (int j = 1; j <= col; j++) {
            if (i == 1) {
               if (j == n || j<= n/2 + 1) {
                  System.out.print("*\t");
               } else {
                  System.out.print("\t");
               }
            } else if (i <= n/2) {
               if (j == n || j == n/2 + 1) {
                  System.out.print("*\t");
               } else {
                  System.out.print("\t");
               }
            } else if (i == n/2 + 1) {
               System.out.print("*\t");
            } else if (i < n) {
               if (j == 1 || j == n/2 + 1) {
                  System.out.print("*\t");
               } else {
                  System.out.print("\t");
               }
            } else {
               if (j == 1 || j >= n/2 + 1) {
                  System.out.print("*\t");
               } else {
                  System.out.print("\t");
               }
            }
         }
         System.out.println();
      }
   }
}
