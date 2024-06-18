package com.array;

public class St11_MissingNumberBetterApproach {

    public static int findMissingNumber(int [] arr, int n){
        int [] hashArray = new int[n + 1];

        for (int i = 0; i < arr.length; i++) {
            hashArray[arr[i]] = 1;
        }
        for (int i = 1; i < n; i++) {
            if (hashArray[i] == 0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] array = {1, 3, 2, 5};
        int n = 5;

        int missingNumber = findMissingNumber(array, n);

        System.out.println("The missing number is : " + missingNumber);
    }
}

// Time Complexity : O(N) + O(N)  =>> O(2N)
// Space Complexity : O(N)