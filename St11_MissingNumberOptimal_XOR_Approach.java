package com.array;

public class St11_MissingNumberOptimal_XOR_Approach {
    public static int findMissingNumber (int [] array, int N) {
        int xor1 = 0;
        int xor2 = 0;
        int n = N-1;

        for (int i = 0; i < N - 1; i++) {
            xor2 = xor2 ^ array[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1);  //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ N;  //XOR up to [1...N]
        return xor1 ^ xor2; // the missing number
    }
    public static void main(String[] args) {
        int [] array = {1, 4, 5, 2};
        int N = 5; // Assuming the array should contain numbers from 1 to 5

        int MissingNumber = findMissingNumber(array, N);
        System.out.println("The missing number is : " + MissingNumber);
    }
}

/*
package com.array;

public class MissingNumberOptimal_XOR_Approach {
    public static int findMissingNumber(int[] array, int n) {
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 1; i <= n; i++) {
            xor1 = xor1 ^ i;
        }

        for (int i = 0; i < n - 1; i++) {
            xor2 = xor2 ^ array[i];
        }

        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 5, 2};
        int n = 5; // Assuming the array should contain numbers from 1 to 5

        int missingNumber = findMissingNumber(array, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}


// Another Striver way



import java.util.*;

public class tUf {
    public static int missingNumber(int []a, int N) {

        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < N - 1; i++) {
            xor2 = xor2 ^ a[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ N; //XOR up to [1...N]

        return (xor1 ^ xor2); // the missing number
    }

    public static void main(String args[]) {
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }
}


 */

