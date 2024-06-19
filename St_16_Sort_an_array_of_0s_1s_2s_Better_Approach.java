package com.array.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class St_16_Sort_an_array_of_0s_1s_2s_Better_Approach {

    public static void sortArray (ArrayList<Integer> array, int n) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < n; i++) {

            if (array.get(i) == 0 ) {
                count0 ++;
            } else if (array.get(i) == 1) {
                count1 ++;
            } else {
                count2 ++;
            }
        }

        // Replace the places in the original array :

        for (int i = 0; i < count0; i++) {
            array.set(i, 0);  // replacing 0's
        }

        for (int i = count0; i < count0 + count1; i++) {
            array.set(i, 1); // replacing 1's
        }

        for (int i = count0 + count1; i < n; i++) {
            array.set(i, 2);  // replacing 2's
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

