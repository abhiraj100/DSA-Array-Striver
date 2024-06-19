package com.array.medium;

import java.util.Arrays;

public class St_16_Sort_an_array_of_0s_1s_2s_BruteForce {

    // Brute Force Approach

    public static void sortArray(int [] array) {
        Arrays.sort(array);
    }
    public static void main(String[] args) {
        int [] array = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0};
        sortArray(array);
        System.out.println(Arrays.toString(array));
    }
}
