package com.array.medium;

import java.util.*;

public class St_25_Rotate_Matrix_Image_by_90_deg_OPTIMAL_APPROACH {
    // OPTIMAL APPROACH

    public static void rotate(int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = temp;
            }
        }
    }

    public static void main (String [] args) {
        int [][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(array);

        System.out.println("Rotated Image");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// Time Complexity : O (N*N) + O (N*N). One O(N*N) is for transposing the matrix and the other is for reversing the matrix.

// Space Complexity : O(1)