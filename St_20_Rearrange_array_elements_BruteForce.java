package com.array.medium;

import java.util.*;


public class St_20_Rearrange_array_elements_BruteForce {

    public static int [] rearrangeBySign(int [] arr, int n) {

        // Define 2 pointers, one  for storing positive
        // and other for negative elements of the array.

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Segregate the array into positives and negatives
        for (int i = 0; i < n; i++) {

            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }

        // Positives on even indices, negatives on odd.

        for (int i = 0; i < n/2; i++) {
            arr[2*i] = pos.get(i);
            arr[2*i + 1] = neg.get(i);
        }

        return arr;
    }

    public static void main(String[] args) {
        // Array Initialisation
        int n = 4;
        int [] arr = {1, 2, -4, -5};

        int [] result = rearrangeBySign(arr, n);

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " , ");
        }

    }
}
