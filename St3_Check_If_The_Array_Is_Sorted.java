package com.array;

// Time Complexity : O(n)
public class St3_Check_If_The_Array_Is_Sorted {
    public static boolean isSorted(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i-1]){

            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        int [] arr = {1, 2, 2, 3, 3, 4 , 8, 19};
        int [] arr = {1, 2, 1, 3, 4};

        boolean sortedArray = isSorted(arr);
        System.out.println("Array is Sorted : " + sortedArray);

    }
}
