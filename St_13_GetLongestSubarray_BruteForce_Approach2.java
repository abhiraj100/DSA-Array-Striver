package com.array;

public class St_13_GetLongestSubarray_BruteForce_Approach2 {
//Longest Subarray with given Sum K(Positives)

    public static int getLongestSubarray(int [] array, long k) {
        int n = array.length;  // Size of the array.

        int length = 0;
        for (int i = 0; i < n; i++) { // starting index
            long sum = 0; // Sum variable

            for (int j = i; j < n; j++) {  // ending index
                // add the current element to the subarray array[i....j-1];
                sum += array[j];

                if (sum == k) {
                    length = Math.max(length, j - i + 1);
                }
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
            long s = 0; // Sum variable
            for (int j = i; j < n; j++) { // ending index
                // add the current element to
                // the subarray a[i...j-1]:
                s += a[j];

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