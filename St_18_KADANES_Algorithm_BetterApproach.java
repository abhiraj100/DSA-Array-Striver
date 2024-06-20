package com.array.medium;

public class St_18_KADANES_Algorithm_BetterApproach {

    public static int maxSubarraySum(int [] arr, int n) {
        int maximum = Integer.MIN_VALUE; // maximum sum

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                // Current subarray = arr[i....j]

                // add the current element arr[j]
                // to the sum i.e. sum of arr[i....j-1]
                sum += arr[j];

                maximum = Math.max(maximum, sum);  // getting the maximum
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        int [] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = array.length;

        int maxSum = maxSubarraySum (array, n);
        System.out.println("The maximum subarray sum is : " + maxSum);
    }
}
