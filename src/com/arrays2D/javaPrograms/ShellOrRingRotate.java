package com.arrays2D.javaPrograms;

import java.util.Scanner;

public class ShellOrRingRotate {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[][] arr = new int[n][m];

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            arr[i][j] = sc.nextInt();
         }
      }
      int S = sc.nextInt();
      int R = sc.nextInt();

      ringRotate(arr, S, R);
      display(arr);
   }
   public static void ringRotate(int[][] arr, int s, int r) {
      int[] oned = fillInOneD(arr, s);
      rotate(oned, r);
      fillFromOneD(arr, oned, s);
   }

   public static int[] fillInOneD (int[][] arr, int s) {
      int minc = s-1, minr = s-1;
      int maxr = arr.length-s, maxc = arr[0].length-s;

      int size = 2 * (maxr - minr + maxc - minc);
      int[] oned = new int[size];

      int k = 0;

      //left wall
      for (int i=minr, j=minc;i<=maxr;i++) {
         oned[k] = arr[i][j];
         k++;
      }

      //bottom wall
      for (int i=maxr, j=minc+1;j<=maxc;j++) {
         oned[k] = arr[i][j];
         k++;
      }

      //right wall
      for (int i=maxr-1, j=maxc;i>=minr;i--) {
         oned[k] = arr[i][j];
         k++;
      }

      //top wall
      for (int i=minr, j=maxc-1;j>=minc+1;j--) {
         oned[k] = arr[i][j];
         k++;
      }

      return oned;
   }

   public static void rotate (int[] arr, int r) {
      int n = arr.length;
      r = r % n;
      if (r < 0)  r += n;

      reverse (arr, 0, n - r - 1);
      reverse (arr, n-r, n-1);
      reverse (arr, 0, n-1);
   }

   public static void reverse (int[] arr, int l, int r) {
      while (l < r) {
         int temp = arr[l];
         arr[l] = arr[r];
         arr[r] = temp;

         l++;
         r--;
      }
   }

   public static void fillFromOneD (int[][] arr, int[] oned, int s) {
      int minc = s-1, minr = s-1;
      int maxr = arr.length-s, maxc = arr[0].length-s;

      int k = 0;

      //left wall
      for (int i=minr, j=minc;i<=maxr;i++) {
         arr[i][j] = oned[k];
         k++;
      }

      //bottom wall
      for (int i=maxr, j=minc+1;j<=maxc;j++) {
         arr[i][j] = oned[k];
         k++;
      }

      //right wall
      for (int i=maxr-1, j=maxc;i>=minr;i--) {
         arr[i][j] = oned[k];
         k++;
      }

      //top wall
      for (int i=minr, j=maxc-1;j>=minc+1;j--) {
         arr[i][j] = oned[k];
         k++;
      }
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
