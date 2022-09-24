package com.strings;

import java.util.*;

public class PalindromicSubStrings {
   public static boolean isPalindrome (String str) {
      int i = 0, j = str.length() - 1;

      while (i <= j) {
         char c1 = str.charAt(i);
         char c2 = str.charAt(j);
         if (c1 != c2)   return false;
         else {
            i++;
            j--;
         }
      }

      return true;
   }

   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      String str = scn.next();
      solution(str);
   }

   public static void solution(String str){
      //write your code here
      for (int i=0;i<str.length();i++) {
         for (int j=i+1; j<=str.length();j++) {
            String sub = str.substring(i, j);
            if (isPalindrome(sub)) {
               System.out.println(sub);
            }
         }
      }
   }
}
