package com.array;

import java.util.Arrays;

public class St5_Left_Rotate_an_Array_by_One_Place_Better {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i-1] = array[i];
        }
        array[array.length-1] = temp;

        System.out.println("Printing the array after left shift of 1 element");
        System.out.println(Arrays.toString(array));
    }
}
