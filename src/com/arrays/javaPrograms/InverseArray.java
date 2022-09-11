package com.arrays.javaPrograms;

import java.util.Scanner;

public class InverseArray {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }

      int res[] =inverseOfArray(arr, n);

      for (int i:
           res) {
         System.out.print(i+" ");
      }
   }
   static int[] inverseOfArray(int[] arr, int n) {
      int[] inv = new int[n];

      for (int i = 0; i < n; i++) {
         int temp = arr[i];
         inv[temp] = i;
      }

      return inv;
   }
}

/*
* i = 0  1  2  3  4
* A = 4  0  1  3  2
* R = 1  2  4  3  0
*
* */
