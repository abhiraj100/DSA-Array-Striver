package com.array.medium;

import java.util.*;

public class St_27_Count_Subarrays_Sum_Equals_K_OPTIMAL_APPROACH {


    public static int findAllSubarraysWithGivenSum (int [] arr, int k) {
        int n = arr.length;  // size of the given array.
        Map<Integer, Integer> mpp = new HashMap<>();
        int preSum = 0;
        int count = 0;

        mpp.put(0, 1); // Setting 0 in the map.
        for (int i = 0; i < n; i++) {
            // add current element to prefix Sum:
            preSum += arr[i];

            // Calculate x-k:
            int remove = preSum - k;

            // Add the number of subarrays to be removed:
            count += mpp.getOrDefault(remove, 0);

            // Update the count of prefix sum in the map.
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
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

// Time Complexity : O(N) or O(N*logN) depending on which map data structure we are using
// unordered map data structure using O(N*logN) & ordered map data structure using O(N)

// Space Complexity : O(N)
