package com.arrays2D.javaPrograms;

import java.util.Scanner;

public class SearchInSortedMatrix {
   public static void main(String[] args) {
      // write your code here
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int arr[][] = new int[n][n];

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            arr[i][j] = sc.nextInt();
         }
      }

      int x = sc.nextInt();

      int res[] = findValue(arr, n, x);

      if (res[0] == -1 || res[1] == -1) {
         System.out.println("Not Found");
      } else {
         for (int t : res)
            System.out.println(t);
      }
   }

   public static int[] findValue(int arr[][], int n, int x) {
      int res[] = {-1, -1};

      int a = 0, b = n - 1;
      while (a < n && b >= 0) {
         if (arr[a][b] < x) {
            a++;
         } else if (arr[a][b] > x) {
            b--;
         } else if (arr[a][b] == x) {
            res[0] = a;
            res[1] = b;
            break;
         }
      }

      return res;
   }
}
