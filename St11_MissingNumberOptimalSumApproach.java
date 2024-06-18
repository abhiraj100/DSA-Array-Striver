package com.array;

public class St11_MissingNumberOptimalSumApproach {

    public static int findMissingNumber (int [] array, int n) {
        // Calculate the expected sum
        int expectedSum = (n * (n + 1)) / 2;

        // Calculate the sum of the array elements
        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            arraySum += num;
        }

        // The missing number is the difference between the expected sum
        int ans = expectedSum - arraySum;
        return ans;
    }

    public static void main(String[] args) {
        int [] array = {1, 4, 5, 2};
        int n = 5; // Assuming the array should contain numbers from 1 to 5

        int MissingNumber = findMissingNumber(array, n);
        System.out.println("The missing number is : " + MissingNumber);
    }
}

/*



import java.util.*;

public class tUf {
    public static int missingNumber(int []a, int N) {

        //Summation of first N numbers:
        int sum = (N * (N + 1)) / 2;

        //Summation of all array elements:
        int s2 = 0;
        for (int i = 0; i < N - 1; i++) {
            s2 += a[i];
        }

        int missingNum = sum - s2;
        return missingNum;
    }

    public static void main(String args[]) {
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }
}

 */