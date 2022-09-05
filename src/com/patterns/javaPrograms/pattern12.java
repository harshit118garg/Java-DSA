package com.patterns.javaPrograms;

import java.util.Scanner;

public class pattern12 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int row = n, a = 0, b = 1;
      for (int i = 1; i <= row; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print(a+"\t");
            int c = a + b;
            a = b;
            b = c;
         }
         System.out.println();
      }
   }
}

/*
*
* 	n = 5
				fibonacci series

		c	r
		1	1	0
		2	2	1	1
		3	3	2	3	5
		4	4	8	13	21	34
		5	5	55	89	144	233	377

		row = n
		a = 0, b = 1
		outer loop will run for i from i = 1 to i = row
			for each i inner loop will run for j from j = 1 to j = i
				print a
				x = a + b
				a = b
				b = x
*
* */