package com.array.medium;

import java.util.*;

public class St_27_Count_Subarrays_Sum_Equals_K_BETTER_APPROACH {


    public static int findAllSubarraysWithGivenSum(int [] arr, int k) {
        int n = arr.length;  // size of the given array.
        int count = 0;  // Number of subarrays :

        for (int i = 0; i < n; i++) {
            // Starting index i

            int sum = 0;
            for (int j = i; j < n; j++) {
                // Ending index j

                // Calculate the sum of subarray [i...j]
                // sum of [i..to..j-1] + arr[j]

                sum += arr[j];

                // Increase the count if sum == k

                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main (String [] args) {
        int [] array = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;
        int cnt = findAllSubarraysWithGivenSum(array, k);
        System.out.println("The number of subarrays is: " + cnt);
    }
}

// Time Complexity : O(N^2)

// Space Complexity : O(1)
