package com.array.medium;

import java.util.*;

public class St_23_Longest_Consecutive_Sequence_OPTIMAL_APPROACH {

    public static int longestSuccessiveELements (int [] arr) {
        int n = arr.length;
        if (n == 0) {
            return 0;
        }

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        // Find the longest sequence

        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int count = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    count = count + 1;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main (String [] args) {
        int [] array = {100, 200, 101, 1, 2, 3, 4};
        int ans = longestSuccessiveELements(array);
        System.out.println("The longest consecutive sequence is : " + ans);
    }

}


// Time Complexity : O (N) + O (2*N) - O (3*N)
// Space Complexity : O (N)