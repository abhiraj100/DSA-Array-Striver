package com.array.hard;

import java.util.*;

public class St_29_Majority_Element_N_by_3_BRUTEFORCE {

    public static List<Integer> majorityElement(int [] v) {
        int n = v.length;  // size of the array
        List<Integer> ls = new ArrayList<>();  // List of answers

        for (int i = 0; i < n; i++) {
            // selected element is v[i]:
            // Checking if v[i] is not already a part of the answer:
            if (ls.size() == 0 || ls.get(0) != v[i]) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    // Counting the frequency of v[i]
                    if (v[j] == v[i]) {
                        count++;
                    }
                }

                // Check if the frequency is greater than n/3 :
                if (count > (n / 3)) {
                    ls.add(v[i]);
                }
            }

            if (ls.size() == 2) {
                break;
            }
        }
        return ls;
    }

    public static void main(String[] args) {
        int [] array = {1, 2, 1, 3, 3, 2, 1, 2};
        List<Integer> ans = majorityElement(array);
        System.out.print("The majority elements are : ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}

// Time Complexity : O(N^2)
// Reason : For every element of the array the inner loop runs for N times. And there are N elements in the array.
//          So, the total time complexity is O(N^2)

// Space Complexity : O(1)
