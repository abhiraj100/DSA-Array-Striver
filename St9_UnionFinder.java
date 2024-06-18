package com.array;

import java.util.ArrayList;
import java.util.HashMap;

class St9_UnionFinder {
    static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> union = new ArrayList<>();

        // Count the frequency of elements in arr1
        for (int num : arr1)
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        // Count the frequency of elements in arr2
        for (int num : arr2)
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        // Add unique elements to the union list
        for (int element : freq.keySet())
            union.add(element);
        return union;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};

        ArrayList<Integer> union = findUnion(arr1, arr2);

        System.out.println("Union of arr1 and arr2 is ");
        for (int val : union)
            System.out.print(val + " ");
    }
}
