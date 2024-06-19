package com.array.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class St_17_MajorityElement_BetterApproach {

    public static int majorityElement(int [] arr) {
        // Size of the given array :
        int n = arr.length;

        // Declaring a map :
        HashMap<Integer, Integer> mpp = new HashMap<>();

        // Starting the elements with its occurrence :
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }

        // Searching for the majority element :
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n/2)) {
                return it.getKey();
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int [] array = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(Arrays.toString(array));

        int result = majorityElement(array);
        System.out.println("The majority element is : " + result);
    }
}
