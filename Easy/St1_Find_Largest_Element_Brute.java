package com.array;

import java.util.Arrays;

public class St1_Find_Largest_Element_Brute {
    public static void main(String[] args) {

        /*  Brute Force way
            Time Complexity : O(n log n)
            Space Complexity : O(1)
         */
        int arr[] = {3, 2, 1, 5, 2};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("largest element is : " + arr[arr.length-1]);
    }
}
