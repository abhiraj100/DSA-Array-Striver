package com.array;

import java.util.Arrays;

public class St1_Find_Largest_Element_Optimal {
    public static void main(String[] args) {

        // Optimal Way
        // Time Complexity : O(n)

        int [] arr = {3, 2, 1, 5, 2};
        System.out.println(Arrays.toString(arr));

        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest Element is : " + largest);
    }
}
