package com.array.medium;

import java.util.Arrays;

public class St_15_TwoSumProblem_BruteForce2 {

    public static int [] twoSum(int n, int [] array, int target) {
        int [] ans = new int[2];
//        ans[0] = ans[1] = -1;
        ans[0] = ans[1] = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (array[i] + array[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] array = {2, 6, 5, 8, 11};
        int n = array.length;
        int target = 14;
        int [] result = twoSum(n, array, target);

        System.out.println(Arrays.toString(result));
        System.out.println("This is the answer for variant 2 : [ " + result[0] + "," + result[1] + "]");
    }
}
