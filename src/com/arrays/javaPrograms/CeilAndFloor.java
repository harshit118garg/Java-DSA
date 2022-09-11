package com.arrays.javaPrograms;

import java.util.Scanner;

public class CeilAndFloor {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      int x = sc.nextInt();

      int floor = Integer.MIN_VALUE;
      int ceil = Integer.MAX_VALUE;

      int low = 0, high = arr.length - 1;

      while (low <= high) {
         int mid = (low + high) / 2;
         if (x < arr[mid]) {
            high = mid - 1;
            ceil = arr[mid];
         } else if (x > arr[mid]) {
            low = mid + 1;
            floor = arr[mid];
         } else {
            ceil = arr[mid];
            floor = arr[mid];
            break;
         }
      }

      System.out.println(floor+"\t"+ceil);

   }
}
