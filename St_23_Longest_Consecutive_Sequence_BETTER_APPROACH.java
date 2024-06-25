package com.array.medium;

import java.util.*;

public class St_23_Longest_Consecutive_Sequence_BETTER_APPROACH {

    public static int longestSuccessiveELements ( int [] arr) {
        int n = arr.length;  // Size of the array
        if (n == 0) {
            return 0;
        }

        // sort the array :
        Arrays.sort(arr);
        int lastSmaller = Integer.MIN_VALUE;
        int count = 0;
        int longest = 1;

        // find longest sequence :

        for (int i = 0; i < n; i++) {
            if (arr[i] - 1 == lastSmaller) {
                // arr[i] is the next element of the current sequence.
                count += 1;
                lastSmaller = arr[i];
            } else if (arr[i] != lastSmaller) {
                count = 1;
                lastSmaller = arr[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static void main (String [] args) {
        int [] array = {100, 200, 101, 1, 2, 3, 4};
        int ans = longestSuccessiveELements(array);
        System.out.println("The longest consecutive sequence is : " + ans);
    }
}

// Time Complexity : O (N.logN) + o (N) , N = size of the given array.
// Reason : o (NlogN) for sorting the array. To find the longest sequence, we are using a loop that results in O (N)
// Space Complexity : o (1), as we are not using any extra space to solve this problem.