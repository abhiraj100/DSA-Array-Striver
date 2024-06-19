package com.array.medium;

import java.util.Arrays;

public class St_17_MajorityElement_OptimalApproach {

    public static int majorityElement (int [] arr) {
        // Size of the given array :
        int n = arr.length;
        int count = 0;  // count variable
        int element = 0; // Element variable

        // Applying the algorithm :
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                element = arr[i];
            } else if (element == arr[i]) {
                count++;
            } else {
                count--;
            }
        }

        // checking if the sorted element is the majority element :
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                count1++;
            }
        }

        if (count1 > (n/2)) {
            return element;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] array = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5};
        System.out.println(Arrays.toString(array));

        int result = majorityElement(array);
        System.out.println("The majority element is : " + result);
    }
}
