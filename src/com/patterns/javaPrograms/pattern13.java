package com.patterns.javaPrograms;

import java.util.Scanner;

public class pattern13 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int row = n;
      for (int i = 0; i < row; i++) {
         int iCj = 1;
         for (int j = 0; j <= i; j++) {
//            int x = fact(i)/(fact(j) * fact(i-j));
//            System.out.print(x+"\t");
            System.out.print(iCj+"\t");
            int iCjp1 = iCj * (i-j)/(j+1);
            iCj = iCjp1;
         }
         System.out.println();
      }
   }
//   static int fact (int a) {
//      if (a == 0)
//         return 1;
//      else
//         return(a * fact(a-1));
//   }
}

/*
*
* 	n = 5

			binomial triangle

		c	r	0	1	2	3	4
		0	0	1
		1	1	1	1
		2	2	1	2	1
		3	3	1	3	3	1
		4	4	1	4	6	4	1

		row = n

		outer loop will start for i from i=0 to i<row
		for each i inner loop will run from j = 0 to j < i
		for any value claculate iCc means i!/( c! * (i-c)! )

		alternative way

		iCj = 1
		iC(j+1) =  iCj * (i - j) / (j + 1)
		iCj = iC(j+1)
*
* */
