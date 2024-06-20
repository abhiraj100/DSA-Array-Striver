package com.array.medium;

public class St_18_KADANES_Algorithm_OptimalApproach {

    public static long maxSubarraySum(int [] arr, int n) {
        long maximum = Long.MIN_VALUE;  // maximum sum
        long sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum > maximum) {
                maximum = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        // To consider the sum of the empty subarray
        // uncomment the following check :
        // if (maximum < 0) maximum = 0;

        return maximum;
    }

    public static void main(String[] args) {
        int [] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = array.length;

        long maxSum = maxSubarraySum(array, n);
        System.out.println("The maximum subarray sum is : "+ maxSum);
    }
}
