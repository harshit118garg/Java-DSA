package com.patterns.javaPrograms;

import java.util.Scanner;

public class pattern8 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int row = n, sp = 0;
      for (int i=1;i<=row;i++) {
         sp = n - i;
         for (int j = sp; j >= 1; j--) {
            System.out.print("\t");
         }
         System.out.println("*");
      }
   }
}

/*
*
* 		n = 5

		sp	r
		4	1					*
		3	2				*
		2	3			*
		1	4		*
		0	5	*

		outer loop will run for i = 1 to n
		for each i inner loop will run
		sp = n - i	(reverse loop)
		print 1 star
*
* */
