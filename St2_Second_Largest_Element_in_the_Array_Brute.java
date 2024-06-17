package com.array;

import java.util.Arrays;

public class St2_Second_Largest_Element_in_the_Array_Brute {
    public static void main(String[] args) {
        // Brute Force Approach
        // Time Complexity : O ( nlogn + n)

        int [] arr = {1, 2, 4, 7, 7, 5};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

        System.out.println("Largest element in the array is arr[n-1] : " + arr[arr.length - 1]);

        int largest = arr[arr.length-1];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest ){
                secondLargest = arr[i];
                break;
            }
        }
        System.out.println("Second Largest Element is : " + secondLargest);
    }
}
