package com.array;

// Optimal Approach
// Time Complexity : O(n)

public class St3_Second_Largest_Element_in_the_Array_Optimal {

    public static int secondLargest(int [] arr){
        int largest = arr[0];
        int secLargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest){
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > secLargest){
                secLargest = arr[i];
            }
        }
        return secLargest;
    }

    public static int secondSmallest(int [] arr){
        int smallest = arr[0];
        int secSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest){
                secSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < secSmallest) {
                secSmallest = arr[i];
            }
        }
        return secSmallest;
    }

    public static void main(String[] args) {

        int [] arr = {1, 2, 4, 7, 7, 5};
        int secondLargestElement = secondLargest(arr);
        int secondSmallestElement = secondSmallest(arr);

        System.out.println("Second Largest Element in the array is : " + secondLargestElement);
        System.out.println("Second Smallest Element in the array is : " + secondSmallestElement);
    }
}
