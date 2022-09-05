package com.patterns.javaPrograms;

import java.util.Scanner;

public class pattern7 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int row = n, sp = 0;
      for (int i=1;i<=row;i++) {
         sp = i - 1;
         for (int j = 1; j <= sp; j++) {
            System.out.print("\t");
         }
         System.out.println("*");
      }
   }
}

/*

		n = 5

		sp	r
		0	1	*
		1	2		*
		2	3			*
		3	4				*
		4	5					*

		outer loop will run for i from i = 1 to n
		for each i inner loop will run
		sp = i - 1
		print sp spaces
		print 1 star

* */
