package com.patterns.javaPrograms;

import java.util.Scanner;

public class pattern4 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int row = n, col = 0, sp = 0;
      for (int i = 1; i <= n; i++) {
         sp = i - 1;
         for (int k = 1; k <= sp; k++) {
            System.out.print("\t");
         }
         col = n - i + 1;
         for (int j = col; j >= 1; j--) {
            System.out.print("*\t");
         }
         System.out.println();
      }
   }
}

//
//      for n = 5
//        r  c  sp
//        1  5  0    *  *  *  *  *
//        2  4  1       *  *  *  *
//        3  3  2          *  *  *
//        4  2  3             *  *
//        5  1  4                *
//
//          outer loop will run for i = 1 to n
//          for each i inner loop will run
//          sp = i - 1     (normal loop)
//          col = n - i + 1   (reverse loop)
//          sp = n - (n-i+1) => n - n + i - 1 => i - 1
//
//          for eg i=3, n = 5
//          sp = i - 1 => 3 - 1 = 2
//          col = n-i+1 => 5 - 3 + 1 = 3
//