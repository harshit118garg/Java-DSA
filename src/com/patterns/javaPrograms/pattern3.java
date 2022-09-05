package com.patterns.javaPrograms;

import java.util.Scanner;

public class pattern3 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int row = n, col = 0, sp = 0;
      for (int i = 1; i <= row; i++) {
         sp = n-i;
         for (int k = sp; k >= 1; k--) {
            System.out.print("\t");
         }
         col = i;
         for (int j = 1; j <= col; j++) {
            System.out.print("*\t");
         }
         System.out.println();
      }
   }
}

//
//      for n = 5
//        r                   c  sp
//        1               *   1  4
//        2           *   *   2  3
//        3        *  *   *   3  2
//        4     *  *  *   *   4  1
//        5  *  *  *  *   *   5  0
//
//          outer loop will run for i = 1 to n
//          for each i inner loop will run
//          sp = n-i (reverse loop)
//          col = i  (normal loop)
//
//          for eg.  i = 4, n= 5
//
//          sp = n - i => 5 - 4 = 1
//          col = i = 4
