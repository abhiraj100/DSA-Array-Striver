package com.array;

import java.util.Arrays;

// Remove duplicates in-place from sorted array
// Optimal Approach
// Time Complexity : O(n)
// Space Complexity : O(1)  => in-place

public class St4_Remove_Duplicates_From_Sorted_Array_Optimal {

    public static int removeDuplicates(int [] arr){
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return (i+1);
    }

    public static void main(String[] args) {
        int [] arr = {1, 1, 2, 2, 2, 3, 3};
        System.out.println(Arrays.toString(arr));

        System.out.print("Number of Unique elements : ");
        System.out.println(removeDuplicates(arr));
    }
}
