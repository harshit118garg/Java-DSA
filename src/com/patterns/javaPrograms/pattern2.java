package com.patterns.javaPrograms;

import java.util.Scanner;

public class pattern2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int row = n, col = 0;
      for (int i = 1; i <= n; i++) {
         col = n-i+1;
         for (int j = col; j >= 1; j--) {
            System.out.print("*\t");
         }
         System.out.println();
      }

   }
}
//
//      for n = 5
//        r                   c
//        1  *  *  *  *  *    5
//        2  *  *  *  *       4
//        3  *  *  *          3
//        4  *  *             2
//        5  *                1
//
//          outer loop will run for i = 1 to n
//          for each i inner loop will run
//          col = n-i+1
//



