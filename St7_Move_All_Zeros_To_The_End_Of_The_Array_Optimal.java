package com.array;

import java.util.ArrayList;
import java.util.Arrays;

public class St7_Move_All_Zeros_To_The_End_Of_The_Array_Optimal {
    // Move all zeros to the end of the array
    // Brute Force Approach
    // Time Complexity : O(2N)
    // Space Complexity : O(N)

    public static void main(String[] args) {
        int [] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        System.out.println(Arrays.toString(arr));

        // Step : 1
        // Time Complexity : 0(N)
        ArrayList<Integer> tempArray = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                tempArray.add(arr[i]);
            }
        }
        
        // Step : 2
        // Time Complexity : 0(X)
        for (int i = 0; i < tempArray.size(); i++) {
            arr[i] = tempArray.get(i);
        }

        int No_of_NonZero = tempArray.size();

        // Step : 3
        // Time Complexity : 0(N-X)
        for (int i = No_of_NonZero; i < arr.length; i++) {
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
