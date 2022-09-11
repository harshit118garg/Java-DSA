package com.arrays.javaPrograms;

import java.util.Scanner;

public class FirstAndLastIndex {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      int x = sc.nextInt();

      int fst = -1, lst = -1;

//      for (int i = 0; i < n; i++) {
//         if (x == arr[i]) {
//            lst = i;
//         }
//      }
//
//      for (int i = n-1; i >= 0; i--) {
//         if (x == arr[i]) {
//            fst = i;
//         }
//      }

      /* using binary search */

      int low = 0, high = n-1;
      while (low <= high) {
         int mid = (low + high) / 2;
         if (x < arr[mid]) {
            high = mid - 1;
         } else if (x > arr[mid]) {
            low = mid + 1;
         } else {
            fst = mid;
            high = mid - 1;
         }
      }

      low = 0;
      high = n-1;
      while (low <= high) {
         int mid = (low + high) / 2;
         if (x < arr[mid]) {
            high = mid - 1;
         } else if (x > arr[mid]) {
            low = mid + 1;
         } else {
            lst = mid;
            low = mid + 1;
         }
      }

      System.out.println(fst + "\t" + lst);
   }
}
