package com.array;

public class St11_MissingNumberWithHash {

    public static int findMissingNumber(int [] array, int n) {
        boolean [] hashArray = new boolean[n + 1];

        for (int num : array) {
            hashArray[num] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!hashArray[i]) {
                return i;
            }
        }

        return -1; // Return a default value in case no missing number is found
    }

    public static void main(String [] args) {
        int [] array = {1, 2, 4, 6, 3, 8, 7};
        int n = 8; // Assuming the array should contain numbers from 1 to 8
        int missingNumber = findMissingNumber(array, n);

        System.out.println("The missing number is: " + missingNumber);
    }
}

