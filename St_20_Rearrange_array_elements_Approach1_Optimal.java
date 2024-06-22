package com.array.medium;

import java.util.*;

public class St_20_Rearrange_array_elements_Approach1_Optimal {

    public static void main(String[] args) {
        // Array Initialization

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, -4, -5));
        ArrayList<Integer> ans = rearrangeBySign(arr);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " , ");
        }
    }

    public static ArrayList<Integer> rearrangeBySign(ArrayList<Integer> arr) {
        int n = arr.size();

        // Define array for storing the ans separately.
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n,0));

        // Positive elements start from 0 and negative from 1.
        int posIndex = 0, negIndex = 1;
        for (int i = 0; i < n; i++) {
            // Fill negative elements in odd indices and inc by 2.

            if (arr.get(i) < 0) {
                ans.set(negIndex, arr.get(i));
                negIndex += 2;
            }

            // Fill positive elements in even indices and inc by 2.
            else {
                ans.set(posIndex, arr.get(i));
                posIndex += 2;
            }
        }
        return ans;
    }
}
