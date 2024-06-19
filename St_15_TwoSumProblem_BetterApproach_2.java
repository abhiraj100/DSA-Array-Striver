package com.array.medium;

import java.util.HashMap;

public class St_15_TwoSumProblem_BetterApproach_2 {

    public static int [] twoSum(int n, int [] array, int target) {
        int [] ans = new int[2];
        ans [0] = ans[1] = Integer.MIN_VALUE;
//        ans [0] = ans[1] = -1;

        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = array[i];
            int moreNeeded = target - num;

            if (mpp.containsKey(moreNeeded)) {
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;
            }

            mpp.put(array[i], i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] array = {2, 6, 5, 8, 11};
        int n = array.length;
        int target = 14;

        int [] result = twoSum(n, array, target);
        System.out.println("This is the answer for variant 2 : [" + result[0] + "," + result[1] + "]");
    }
}
