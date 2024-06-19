package com.array.medium;

import java.util.Arrays;

public class St_15_TwoSum_Optimal {

    public static String twoSum (int n, int [] array, int target) {
        Arrays.sort(array);
        int left = 0, right = n - 1;

        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target) {
                left ++;
            } else {
                right --;
            }
        }
        return "NO";
    }

    public static void main(String [] args) {
        int [] array = {2, 6, 5, 8, 11};
        int n = array.length;
        int target = 14;

        String result = twoSum(n , array, target);
        System.out.println("This is the answer for variant 1 : " + result);
    }
}
