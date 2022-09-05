package com.patterns.javaPrograms;

import java.util.Scanner;

public class pattern6 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int row = n, st = 0, sp = 0, mid = n/2 + 1;

      for (int i=1;i<=row;i++) {
         if (i<=mid) {
            st = (n - 2*i + 3) / 2;
            sp = (2 * i - 1);
            for (int a = st; a >= 1; a--) {
               System.out.print("*\t");
            }
            for (int b = 1; b <= sp; b++) {
               System.out.print("\t");
            }
            for (int a = st; a >= 1; a--) {
               System.out.print("*\t");
            }
         } else {
            st++;
            sp -= 2;
            for (int a = 1; a <= st; a++) {
               System.out.print("*\t");
            }
            for (int b = sp; b >= 1; b--) {
               System.out.print("\t");
            }
            for (int a = 1; a <= st; a++) {
               System.out.print("*\t");
            }
         }
         System.out.println();
      }
   }
}
//
//	     n = 5
//
//            st sp	st	r	1	2	3	4	5	6	7
//            3	 1	3	1	*	*	*		*	*	*
//            2	 3	2	2	*	*				*	*
//            1	 5	1	3	*						*
//            2	 3	2	4	*	*				*	*
//            3	 1	3	5	*	*	*		*	*	*
//
//            total number of columns = n+2
//            row = n
//            outer loop will run for i = 1 to n
//
//            for each i inner loop will run
//            mid = n/2 + 1
//
//            if (i <= mid) {
//            st = (n-2i+3)/2	(reverse loop)
//            sp = (2i-1)	(normal loop)
//            st = (n-2i+3)/2 (reverse loop)
//            } else {
//            st = st + 1 (normal loop)
//            sp = sp - 2 (reverse loop)
//            st = st + 1 (normal loop)
//            }
//

