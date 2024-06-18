package com.array;

import java.util.Arrays;

public class St5_Left_Rotate_an_Array_by_One_Place_Brute {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        int k = 1;
        int z = array.length - 1;

        int [] newArray = new int[array.length];

        for (int i = k; i < array.length; i++) {
             newArray[i-1] = array[i];
        }

        for (int j = 0; j < k; j++) {
            newArray[j+z] = array[j];
        }

        // printing the array
        System.out.println("Elements of the Array after Left Shifting of 1 element in the array :");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);

        }
    }
}
