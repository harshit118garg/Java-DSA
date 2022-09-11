package com.arrays.javaPrograms;

import java.util.Scanner;

public class SpanArray {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      int max = Integer.MIN_VALUE;     // -2147483648
      int min = Integer.MAX_VALUE;     //  2147483647
      int span = 0;
      for (int i = 0; i < n; i++) {
         if (arr[i] > max) {
            max = arr[i];
         }
         if (arr[i] < min) {
            min = arr[i];
         }
      }

      span = max - min;
      System.out.println(span);
   }
}
