package com.patterns.javaPrograms;

import java.util.Scanner;

public class pattern16 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int row = n, col = 2*row - 1;
      int st = 0, sp = 2*n-3;
      for (int i = 1; i <= row; i++) {
         int val = 1;
         st = i;
         for (int a = 1; a <=st ; a++) {
            System.out.print(val+"\t");
            val++;
         }

         for (int b = sp; b >= 1; b--) {
            System.out.print("\t");
         }

         st = i;
         if (i == row) {
            st--;
            val--;
         };
         for (int a = 1; a <=st ; a++) {
            val--;
            System.out.print(val+"\t");
         }
         sp -= 2;
         System.out.println();
      }
   }
}
