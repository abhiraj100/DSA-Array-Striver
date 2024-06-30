package com.array.hard;

import java.util.*;

public class St_28_Pascal_Triangle_Variation2_OPTIMAL {
    public static void pascalTriangle(int n) {
        long ans = 1;
        System.out.print(ans + " "); // printing 1st element

        // Printing the rest of the part :
        for (int i = 1; i < n; i++) {
            ans = ans * (n - i);
            ans = ans / i;
            System.out.print(ans + " ");
        }
        System.out.println();
    }

    public static void main (String [] args) {
        int n = 5;
        pascalTriangle(n);
    }
}

// Time Complexity : O(N)
// Space Complexity : O(1)
