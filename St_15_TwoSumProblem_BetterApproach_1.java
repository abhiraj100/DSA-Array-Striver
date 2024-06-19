package com.array.medium;

import java.util.HashMap;

public class St_15_TwoSumProblem_BetterApproach_1 {

    public static String twoSum(int n, int [] array, int target){
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = array[i];
            int moreNeeded = target - num;

            if (mpp.containsKey(moreNeeded)) {
                return "YES";
            }
            mpp.put(array[i], i);
        }
        return "NO";
    }

    public static void main(String [] args) {
        int [] array = {2, 6, 5, 8, 11};
        int n = array.length;
        int target = 14;

        String result = twoSum(n, array, target);
        System.out.println("This is the answer for variant 1 : " + result);
    }
}
