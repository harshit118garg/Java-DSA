package com.arrays2D.javaPrograms;

import java.util.Scanner;

public class MatrixMultiply {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int m1 = sc.nextInt();
      int arr1[][] = new int[n1][m1];

      for (int i = 0; i < arr1.length; i++) {
         for (int j = 0; j < arr1[0].length; j++) {
            arr1[i][j] = sc.nextInt();
         }
      }
      int n2 = sc.nextInt();
      int m2 = sc.nextInt();
      int arr2[][] = new int[n2][m2];

      for (int i = 0; i < arr2.length; i++) {
         for (int j = 0; j < arr2[0].length; j++) {
            arr2[i][j] = sc.nextInt();
         }
      }

      System.out.println("matrix 1");
      for (int i = 0; i < arr1.length; i++) {
         for (int j = 0; j < arr1[0].length; j++) {
            System.out.print(arr1[i][j] + "\t");
         }
         System.out.println();
      }
      System.out.println("matrix 2");
      for (int i = 0; i < arr2.length; i++) {
         for (int j = 0; j < arr2[0].length; j++) {
            System.out.print(arr2[i][j] + "\t");
         }
         System.out.println();
      }

      if (m1 != n2) {      // check if num of cols in matrix 1 === num of rows in matrix 2
         System.out.println("Invalid Input");   // if not then matrix matrix multiplication
         return;           // not possible
      }

      int res[][] = new int[n1][m2];         // create a matrix of n1 rows & m2 cols

      for (int i = 0; i < res.length; i++) {
         for (int j = 0; j < res[0].length; j++) {
            for (int k = 0; k < m1; k++) {
               res[i][j] += arr1[i][k] * arr2[k][j];
            }
         }
      }
      System.out.println("matrix multiplication");
      for (int i = 0; i < res.length; i++) {
         for (int j = 0; j < res[0].length; j++) {
            System.out.print(res[i][j] + "\t");
         }
         System.out.println();
      }
   }
}
