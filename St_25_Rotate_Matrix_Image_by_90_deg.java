package com.array.medium;

import java.util.*;

public class St_25_Rotate_Matrix_Image_by_90_deg {

    // BRUTE FORCE APPROACH
    public static int [][] rotate (int [][] matrix) {
        int n = matrix.length;
        int [][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - i - 1] = matrix[i][j];
            }
        }
        return rotated;
    }

    public static void main (String [] args) {
        int [][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int [][] rotated = rotate(array);
        System.out.println("Rotated Image");

        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated.length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// Time Complexity : O (N*N) to linearly iterate and put it into some other matrix.
// Space Complexity : O(N*N) to copy it into some other matrix.