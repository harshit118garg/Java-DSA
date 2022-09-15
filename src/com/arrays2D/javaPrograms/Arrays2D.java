package com.arrays2D.javaPrograms;

import java.util.Scanner;

public class Arrays2D {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int arr[][] = new int[n][m];

      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = sc.nextInt();
         }
      }

      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[0].length; j++) {
            System.out.print(arr[i][j]+"\t");
         }
         System.out.println();
      }
   }
}
