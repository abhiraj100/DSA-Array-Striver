package com.array;

import java.util.Arrays;

public class St6_Left_Rotate_an_Array_by_D_places_Optimal {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(array));

        int d = 3;
        int [] temp = {1, 2, 3};

        for (int i = d; i < array.length; i++) {
            array[i-d] = array[i];
        }

        for (int i = 0; i < d; i++) {
            array[array.length - d + i] = temp[i];
        }

        System.out.println(Arrays.toString(array));
    }
}

