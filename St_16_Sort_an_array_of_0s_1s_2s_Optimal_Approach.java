package com.array.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class St_16_Sort_an_array_of_0s_1s_2s_Optimal_Approach {

    public static void sortArray(ArrayList<Integer> array, int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1;  // 3 pointers

        while (mid <= high) {
            if (array.get(mid) == 0) {
                // Swapping array[low] and array[mid]

                int temp = array.get(low);
                array.set(low, array.get(mid));
                array.set(mid, temp);

                low++;
                mid++;
            } else if (array.get(mid) == 1) {
                mid++;

            } else {
                // Swapping array[mid] and array[high]
                int temp = array.get(mid);
                array.set(mid, array.get(high));
                array.set(high, temp);

                high--;
            }
        }
    }

    public static void main(String[] args) {
        int n = 11;
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(new Integer[] {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0}));
        sortArray(array, n);
        System.out.println("After Sorting : ");

        for (int i = 0; i < n; i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
    }
}
