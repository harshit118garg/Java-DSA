package com.arrays.javaPrograms;

import java.util.Scanner;

public class RotateArray {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      int k = sc.nextInt();

      k = k % n;
      if (k < 0) {
         k += n;
      }

      reverse(arr, 0, n - k - 1);
      reverse(arr, n - k, n - 1);
      reverse(arr, 0, n - 1);

      for (int i :
              arr) {
         System.out.print(i + " ");
      }
   }

   public static void reverse(int[] arr, int st, int ls) {
      int start = st;
      int end = ls;
      while (start < end) {
         int temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
         start++;
         end--;
      }
   }
}

/*
 * i =    0  1  2  3  4
 * arr=   88 99 44 55 22
 * k=-4   2 elems shifted from front to back
 *    k=-1  99 44 55 22 88
 *    k=-2  44 55 22 88 99
 *    k=-3  55 22 88 99 44
 *    k=-4  22 88 99 44 55
 * k=2    2 elems shifted from back to front
 *           55 22 88 99 44
 * k=7     7 elemes shifted from back to front
 *      k=1  22 88 99 44 55
 *      k=2  55 22 88 99 44
 *      k=3  44 55 22 88 99
 *      k=4  99 44 55 22 88
 *      k=5  88 99 44 55 22
 *      k=6  22 88 99 44 55
 *      k=7  55 22 88 99 44
 *
 *       if (k>n) k = k%n
 *       if (k<0) k = n+k
 * i =    0  1  2  3  4
 * arr=   88 99 44 55 22
 * k=3
 *
 *  s1:   88 99 44 | 55 22  // break into 2 parts   (0 to k-1 & k to n-1)
 *  s2:   44 99 88 | 22 55  // reverse both parts
 *  s3:   55 22 88 | 99 44  // reverse complete array
 *
 * 5
 * 88 99 44 55 22
 * k = -2
 * 44 55 22 88 99
 * k = 2
 * 55 22 88 99 44
 * */