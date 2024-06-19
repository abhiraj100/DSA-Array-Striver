package com.array;

public class St_12_Optimal_Approach {

    public static int getSingleElement(int [] array){
        int xor = 0;
        for (int i = 0; i < array.length; i++) {
            xor = xor ^ array[i];
        }
        return xor;
    }


    public static void main(String[] args) {
        int [] array = {4, 1, 2, 1, 2};
        int result = getSingleElement(array);
        System.out.println("The Single element is: " + result);
    }
}
