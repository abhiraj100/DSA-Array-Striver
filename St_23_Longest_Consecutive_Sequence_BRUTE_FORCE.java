package com.array.medium;

import java.util.*;

public class St_23_Longest_Consecutive_Sequence_BRUTE_FORCE {

    // Longest Consecutive Sequence in an Array

    public static boolean linearSearch (int [] arr, int num) {
        int n = arr.length;  // Size of the array
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static int longestSuccessiveElements (int [] arr) {
        int n = arr.length;  // Size of the array
        int longest = 1;

        // pick an element and search for its consecutive numbers :

        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int count = 1;

            // search for consecutive numbers using linear search :
            while (linearSearch(arr, x + 1) == true) {
                x += 1;
                count += 1;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static void main (String [] args) {
        int [] array = {100, 200, 101, 1, 2, 3, 4};
        int ans = longestSuccessiveElements(array);
        System.out.println("The longest consecutive sequence is : " + ans);
    }
}

// Time Complexity : O (N^2)
// Space Complexity : O (1)
