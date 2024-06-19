package com.array.medium;

import java.util.Arrays;

public class St_17_MajorityElement_BruteForceApproach {

    public static int majorityElement(int [] arr) {
        // Size of the given array :
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // Selected element is arr[i]
            int count = 0;
            for (int j = 0; j < n; j++) {
                // Counting the frequency of arr[i]
                if (arr[j] == arr[i]) {
                    count++;
                }
            }

            // Check if frequency is greater than n/2:
            if (count > (n/2)) {
                return arr[i];
            }
        }
        return -1;  // in case no majority element is not found in the given array
    }

    public static void main(String[] args) {
        int [] array = {2, 2, 1, 1, 1, 2, 2, 3, 2};
        System.out.println(Arrays.toString(array));

        int result = majorityElement(array);
        System.out.println("The majority element is : " + result);
    }
}
