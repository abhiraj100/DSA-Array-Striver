package com.array;

import java.util.Arrays;

public class St5_Left_Rotate_an_Array_by_One_Place_Optimal {

    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        int X = array[0];
        for (int i = 0; i < array.length-1; i++) {
            array[i] = array[i+1];
        }
        array[array.length-1] = X;


        // Printing the array after left shift
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
        System.out.println("Printing the array after shifting 1 element ");
        System.out.println(Arrays.toString(array));

    }
}
