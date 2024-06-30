package com.array.hard;

public class St_28_Pascal_Triangle_Variation1_OPTIMAL {


    public static long nCr(int n, int r) {
        long res = 1;
        // n is the column number

        // calculating nCr :
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static int pascalTriangle (int r, int c) {
        int element = (int) nCr(r - 1, c - 1);
        return element;
    }

    public static void main(String [] args) {
        int r = 5; // row number
        int c = 3;  // col number
        int element = pascalTriangle(r, c);
        System.out.println("The element at position (r, c) is : " + element);
    }
}

// Time Complexity : O(c), where c = given column number
// Space Complexity : O(1)