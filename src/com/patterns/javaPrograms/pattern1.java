package com.patterns.javaPrograms;

import java.util.Scanner;

public class pattern1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int row = n, col = 0;
      for (int i = 1; i <= n; i++) {
         col = i;
         for (int j = 1; j <= col; j++) {
            System.out.print("*\t");
         }
         System.out.println();
      }
   }
}

/*
        for n = 4
    c  r
    1  1   *
    2  2   * *
    3  3   * * *
    4  4   * * * *

     outer loop will run for i = 1 to n
     for each i inner loop will run
     c = r

*/