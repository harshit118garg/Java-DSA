package com.patterns.javaPrograms;

import java.util.Scanner;

public class pattern15 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int row = n, col = 0, sp = 0, max = n - 2, mid = n/2+1, borderValue = 0, innerValue = 0;
      for (int i = 1; i <= row; i++) {
         if (i<=mid) {
            sp = mid - i;
            for (int k = sp; k >= 1; k--) {
               System.out.print("\t");
            }
            col = 2*i - 1;
            borderValue = i;
            innerValue = borderValue;
            for (int j = 1; j <= col; j++) {
               System.out.print(innerValue+"\t");
               if (j <= col/2) {
                  innerValue++;
               } else {
                  innerValue--;
               }
            }
         } else {
            sp = i - mid;
            for (int k = 1; k <= sp; k++) {
               System.out.print("\t");
            }
            col = max + 2*(1 - sp);
            borderValue--;
            innerValue = borderValue;
            for (int j = col; j >= 1; j--) {
               System.out.print(innerValue+"\t");
               if (j > (col+1)/2) {
                  innerValue++;
               } else {
                  innerValue--;
               }
            }
         }
         System.out.println();
      }

//      method 2
//      ===============================================================
//      int row = n, col = 1, sp = n/2, mid = n/2, outerValue=1, innerValue = 0;
//      for (int i = 1; i <= row; i++) {
//         for (int k = 1; k <= sp; k++) {
//            System.out.print("\t");
//         }
//
//         innerValue = outerValue;
//         for (int j = 1; j <= col; j++) {
//            System.out.print(innerValue+"\t");
//            if (j <= col/2) {
//               innerValue++;
//            } else{
//               innerValue--;
//            }
//         }
//
//         if (i <= mid) {
//            sp--;
//            col += 2;
//            outerValue++;
//         } else {
//            sp++;
//            col -= 2;
//            outerValue--;
//         }
//         System.out.println();
//      }
   }
}
