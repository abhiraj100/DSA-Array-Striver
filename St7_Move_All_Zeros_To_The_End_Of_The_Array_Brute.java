package com.array;


public class St7_Move_All_Zeros_To_The_End_Of_The_Array_Brute {

    private static void moveZerosToEnd(int[] nums) {
        int nonZeroIndex = 0;

        // Move non-zeros to the beginning of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }

        // Fill the remaining elements with zeros
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex++] = 0;
        }
    }


    public static void main(String[] args) {
        int[] array = {1, 0, 2, 3, 4, 0, 0, 4, 5, 2};

        moveZerosToEnd(array);

        // Print the modified array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
