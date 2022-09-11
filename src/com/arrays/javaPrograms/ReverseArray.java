package com.arrays.javaPrograms;

import java.util.Scanner;

public class ReverseArray {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      int start = 0;
      int end = arr.length - 1;
      while (start < end) {
         int temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
         start++;
         end--;
      }
      for (int i:
           arr) {
         System.out.print(i+" ");
      }
   }
}
