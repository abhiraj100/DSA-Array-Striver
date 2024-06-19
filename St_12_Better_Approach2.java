package com.array;

import java.util.HashMap;
import java.util.Map;

public class St_12_Better_Approach2 {

    public static int getSingleElement(int[] array) {
        // size of the array
        int n = array.length;

        // Declare the hashmap.
        // And hash the given array:
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(array[i], 0);
            mpp.put(array[i], value + 1);
        }

        // Find the single element and return the answer:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1)
                return it.getKey();
        }

        // This line will never execute
        // If the array contains a single element.
        return -1;
    }

    public static void main(String[] args) {
        int [] array = {4, 1, 2, 1, 2};
        int result = getSingleElement(array);
        System.out.println("The Single element is: " + result);
    }
}


/*



import java.util.*;

public class tUf {
    public static int getSingleElement(int []arr) {
        //size of the array:
        int n = arr.length;

        // Declare the hashmap.
        // And hash the given array:
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }

        //Find the single element and return the answer:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
}

 */