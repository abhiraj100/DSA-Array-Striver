package com.array;

public class St_13_GetLongestSubarray_BruteForce_Approach1 {
//Longest Subarray with given Sum K(Positives)

   public static int getLongestSubarray(int [] array, long k) {
       int n = array.length; // size of the array.

       int length = 0;
       for (int i = 0; i < n; i++) {  // starting index
           for (int j = i; j < n; j++) { // ending index
               // add all the elements of
               // subarray = a[i...j] :
               long sum = 0;
               for (int l = i; l <= j; l++) {
                   sum += array[l];
               }

               if (sum == k)
                   length = Math.max(length, j - i + 1);
           }
       }
       return length;
   }


    public static void main(String[] args) {
        int [] array = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        long k = 3;
        int length = getLongestSubarray(array, k);
        System.out.println("The length of the longest subarray is : " + length);
    }
}

/*



import java.util.*;

public class tUf {
    public static int getLongestSubarray(int []a, long k) {
        int n = a.length; // size of the array.

        int len = 0;
        for (int i = 0; i < n; i++) { // starting index
            for (int j = i; j < n; j++) { // ending index
                // add all the elements of
                // subarray = a[i...j]:
                long s = 0;
                for (int K = i; K <= j; K++) {
                    s += a[K];
                }

                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}


 */
