package com.arrays.javaPrograms;

import java.util.Scanner;

public class SubsetsArray {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      int lim = (int) Math.pow(2, n);

      for (int i = 0; i < lim; i++) {
         String subset = "";
         int temp = i;
         for (int j = n - 1; j >= 0; j--) {
            int rem = temp % 2;
            temp /= 2;

            if (rem == 0) {
               subset = "-\t" + subset;
            } else {
               subset = arr[j] + "\t" + subset;
            }
         }
         System.out.println(subset);
      }
   }
}
