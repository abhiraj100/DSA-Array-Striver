package com.array;

import java.util.*;

public class St_13_GetLongestSubarray_Optimal_Approach {

    public static int getLongestSubarray (int [] array, long k) {
        int n = array.length;  // size of the array.

        int left = 0, right = 0;  // 2 pointers
        long sum = array[0];
        int maxLen = 0;

        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:

            while (left <= right && sum > k) {
                sum -= array[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward the right pointer :
            right++;
            if (right < n) {
                sum += array[right];
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
       int [] array = {2, 3, 5, 1, 9};
       long k = 10;
       int length = getLongestSubarray(array, k);
        System.out.println("The length of the longest subarray is : " + length);
    }
}
