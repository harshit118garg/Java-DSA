package com.basics.javaProgram;

import java.util.Scanner;

public class PrintDigitsOfANumber {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int numOfDigits = Integer.toString(n).length();
      int div = (int)Math.pow(10, numOfDigits - 1);

      while (div != 0) {
         int q = n / div;
         System.out.println(q);
         n %= div;
         div /= 10;
      }
   }
}

/*
*
*        hint:
*              n = 987452
*              numOfDigits = 6
*              div = 10^(6-1)
*
*           keep doing
*              div | n
*              div = div / 10
*           till n != 0
*
*           example:   10^5 | 987452
*                      10^4 | 87452    9
*                      10^3 | 7452     8
*                      10^2 | 452      7
*                      10^1 | 52       4
*                      10^0 | 2        5
*                           | 0        2
*
* */
