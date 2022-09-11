package com.arrays.javaPrograms;

import java.util.Scanner;

public class binarySearch {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      int x = sc.nextInt();
//      int n = 5;
//      int arr[] = {10,20,30,50,90};
//      int x = 20;

      int index = binSearch(arr, 0, n-1, x);
      System.out.println(index);
   }
   public static int binSearch(int[] arr, int s, int e, int x) {
      int idx = -1;

      while (s <= e) {
         int mid = (s + e) / 2;
         if (x < arr[mid]) {
            e = mid - 1;
         } else if (x > arr[mid]) {
            s = mid + 1;
         } else {
            idx = mid;
            break;
         }
      }

      return idx;
   }
}
