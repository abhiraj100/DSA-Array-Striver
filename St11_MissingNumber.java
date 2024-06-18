package com.array;

public class St11_MissingNumber {

    // Function to find the missing number in an array
    public static int findMissingNumber(int[] nums, int n) {
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i; // Missing number found
            }
        }
        return -1; // If no missing number is found (should not happen in a valid scenario)
    }

    public static void main(String[] args) {
        // Example usage
        int[] array = {1, 2, 4, 6, 3, 7, 8};
        int n = 8; // Assuming the array should contain numbers from 1 to 8
        int missingNumber = findMissingNumber(array, n);

        System.out.println("The missing number is: " + missingNumber);
    }
}
