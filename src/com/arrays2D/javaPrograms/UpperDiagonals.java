package com.arrays2D.javaPrograms;

import java.util.Scanner;

public class UpperDiagonals {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[][] = new int[n][n];

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            arr[i][j] = sc.nextInt();
         }
      }

      for (int g = 0; g < n; g++) {
         for (int i=0, j=g;j<n;i++,j++) {
            System.out.println(arr[i][j]);
         }
      }
   }
}
