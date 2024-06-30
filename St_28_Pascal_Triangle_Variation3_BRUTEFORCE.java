package com.array.hard;

import java.util.*;

public class St_28_Pascal_Triangle_Variation3_BRUTEFORCE {


    public static int nCr(int n, int r) {
        long res = 1;

        // Calculating nCr :
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int) res;
    }

    public static List<List<Integer>> pascalTriangle (int n) {
        List<List<Integer>> ans = new ArrayList<>();

        // Store the entire Pascal's triangle:
        for (int row = 1; row <= n; row++) {
            List<Integer> tempList = new ArrayList<>();  // temporary List
            for (int col = 1; col <= row; col++) {
                tempList.add(nCr(row - 1, col - 1));
            }
            ans.add(tempList);
        }
        return ans;
    }

    public static void main (String [] args) {
        int n = 5;
        List<List<Integer>> ans = pascalTriangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}

// Time Complexity : O(N*N*R) - O(N^3)
// Space Complexity : O(1)