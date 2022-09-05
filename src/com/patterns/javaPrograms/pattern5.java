package com.patterns.javaPrograms;

import java.util.Scanner;

public class pattern5 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int row = 2*n-1, col = 0, sp = 0, max = 2*n - 3;
      for (int i = 1; i <= row; i++) {
         if (i<=n) {
            sp = n - i;
            for (int k = sp; k >= 1; k--) {
               System.out.print("\t");
            }
            col = 2*i - 1;
            for (int j = 1; j <= col; j++) {
               System.out.print("*\t");
            }
         } else {
            sp = i - n;
            for (int k = 1; k <= sp; k++) {
               System.out.print("\t");
            }
            col = max + 2*(1 - sp);
            for (int j = col; j >= 1; j--) {
               System.out.print("*\t");
            }
         }
         System.out.println();
      }
   }
}

//
//      for n = 5
//        r  c  sp
//        1  1  4                *
//        2  3  3             *  *  *
//        3  5  2          *  *  *  *  *
//        4  7  1       *  *  *  *  *  *  *
//        5  9  0    *  *  *  *  *  *  *  *  *
//        6  7  1       *  *  *  *  *  *  *
//        7  5  2          *  *  *  *  *
//        8  3  3             *  *  *
//        9  1  4                *
//
//          max = 2n-1-2 => 2n-3
//          outer loop will run for i = 1 to 2n-1
//          if (i<=n) {
//             inner loop will run for i
//             sp = n-i    (reverse loop)
//             col = 2i - 1   (normal loop)
//          // c = a + (n-1)d => 1 + (i-1)2 => 1 + 2i -2 => 2i - 1
//          } else {
//             inner loop will run for i
//             sp = i - n (normal loop)
//             col = max + (sp-1)(-2)  (reverse loop)
//          }
//
//          for eg.. n = 5, i = 9, max = 2(5)-3 = 7
//          sp = i - n => 9 - 5 = 4
//          col = max + (sp - 1) (-2) => 7 + (4-1)(-2) = 7 + (-6) = 1
//