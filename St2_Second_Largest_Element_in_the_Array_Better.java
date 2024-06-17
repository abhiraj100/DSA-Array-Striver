package com.array;

public class St2_Second_Largest_Element_in_the_Array_Better {
    public static void main(String[] args) {
        // Better Approach
        // Time Complexity : O(N + N) => O(2n)

        int [] arr = {1, 2, 4, 7, 7, 5};

        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest){
                largest = arr[i];
            }
        }

        int secondLargest = Integer.MIN_VALUE;
//        int secondLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest Element in the array is : " + secondLargest);
    }
}
