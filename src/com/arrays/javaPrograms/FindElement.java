package com.arrays.javaPrograms;

import java.util.Scanner;

public class FindElement {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      int d = sc.nextInt();
      int ind = -1;
      for (int i = 0; i < n; i++) {
         if (arr[i] == d)  ind = i;
      }
      System.out.println(ind);
   }
}
