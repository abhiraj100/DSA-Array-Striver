package com.array.medium;

import java.util.*;

public class St_15_TwoSumProblem_BruteForce1 {

    public static String twoSum (int n, int [] array, int target){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i] + array[j] == target) {
                    return "YES";
                }
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        int [] array = {2, 6, 5, 8, 11};
        int n = array.length;
        int target = 14;

        String result = twoSum(n, array, target);
        System.out.println("This is the result for varient 1 : " + result);
    }
}
