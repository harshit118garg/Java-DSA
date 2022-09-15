package com.arrays2D.javaPrograms;

import java.util.Scanner;

public class RotateBy90deg {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[][] = new int[n][n];

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            arr[i][j] = sc.nextInt();
         }
      }

      // find transpose of matrix first
      int[][] tsp = new int[n][n];

      for(int i=0;i<n;i++) {
         for (int j=0;j<n;j++) {
            tsp[i][j] = arr[j][i];
         }
      }

      // reverse each row of the matrix using array reverse algorithm
      for (int i=0;i<n;i++) {
         int low = 0, high = n-1;
         while (low <= high) {
            int temp = tsp[i][low];
            tsp[i][low] = tsp[i][high];
            tsp[i][high] = temp;

            low++;
            high--;
         }
      }

      display(tsp);
   }
   public static void display(int[][] arr){
      for(int i = 0; i < arr.length; i++){
         for(int j = 0; j < arr[0].length; j++){
            System.out.print(arr[i][j] + " ");
         }
         System.out.println();
      }
   }
}
