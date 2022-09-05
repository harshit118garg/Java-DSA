package com.patterns.javaPrograms;

import java.util.Scanner;

public class pattern9 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int row = n, col=  n;
      for (int i = 1; i <= row; i++) {
         for (int j = 1; j <= col; j++) {
            if (i==j || (i+j == n+1)) {
               System.out.print("*\t");
            } else {
               System.out.print("\t");
            }
         }
         System.out.println();
      }
   }
}

/*
*
* 	for n  = 5

				r	1	2	3	4	5
				1	*				*
				2		*		*
				3			*
				4		*		*
				5	*				*

		row = n
		col = n

		outer loop for i from i = 1 to i = row

		for each i inner loop will run from j = 1 to j = col

		if (i==j || (i+j == n+1)) {
			print star
		} else {
			print space
		}


* */