package com.array.medium;

import java.util.*;

public class St_18_KADANES_Algorithm_BruteForce {

    public static int maxSubarraySum(int [] arr, int n) {
        int maximum = Integer.MIN_VALUE;   // maximum sum

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Subarray = arr [i.....j]
                int sum = 0;

                // add all the elements of the subarray :
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                maximum = Math.max(maximum, sum);
            }
        }

        return maximum;
    }

    public static void main(String[] args) {
        int [] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = array.length;
        int maxSum = maxSubarraySum(array, n);
        System.out.println("The maximum subarray sum is : " + maxSum);
    }
}
