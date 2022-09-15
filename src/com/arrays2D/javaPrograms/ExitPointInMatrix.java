package com.arrays2D.javaPrograms;

import java.util.Scanner;

public class ExitPointInMatrix {
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

      // int i = 0;
      // int j = 0;
      // int dir = 0;   //East->0 South->1 West->2 North->3

      // while (true) {
      //     dir = (dir + arr[i][j]) % 4; //To Keep the values between 0 and 3
      //     if (dir == 0) {
      //         j++;  //Move in the same row (east direction)
      //     } else if (dir == 1) {
      //         i++;  //Move down the column (south direction)
      //     } else if (dir == 2) {
      //         j--;  //Move backwards in the row (west direction)
      //     } else {
      //         i--;  //Move up the column (north direction)
      //     }

      //     if (i < 0) {
      //         i++;  //exit point is one row head (in 0th row)
      //         break;
      //     } else if (j < 0) {
      //         j++;   //exit point is one col ahead (in 0th col)
      //         break;
      //     } else if (i == n) {
      //         i--;  //exit point is one row back (in last row)
      //         break;
      //     } else if (j == m) {
      //         j--;  //exit point is one col back (in last col)
      //         break;
      //     }
      // }

      // System.out.println(i);
      // System.out.println(j);

      int dir = 0;  //  0 => E, 1 => S, 2 => W, 3 => N
      int i = 0, j = 0;

      while ( true ) {
         dir = (dir + arr[i][j]) % 4;

         if (dir == 0) {
            j++;
         } else if (dir == 1) {
            i++;
         } else if (dir == 2) {
            j--;
         } else {
            i--;
         }

         if (i<0) {
            i++;
            break;
         } else if (j<0) {
            j++;
            break;
         } else if (i>arr.length-1) {
            i--;
            break;
         } else if (j>arr[0].length-1) {
            j--;
            break;
         }
      }

      System.out.println(i);
      System.err.println(j);
   }
}
