package com.patterns.javaPrograms;

import java.util.Scanner;

public class pattern11 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int row = n, sum = 0;
      for (int i = 1; i <= row; i++) {
         for (int j = 1; j <= i; j++) {
            sum++;
            System.out.print(sum+"\t");
         }
         System.out.println();
      }
   }
}

/*
*
* 	n = 5


		c	r
		1	1	1
		2	2	2	3
		3	3	4	5	6
		4	4	7	8	9	10
		5	5	11	12	13	14	15

		row = 5
		sum = 0
		outer loop will run for i from i = 1 to i = row
			for each i inner loope will run for j from j = 1 to j = i
			sum++
			print sum
*
* */