package com.array;

public class St_12_Better_Approach1 {
    // St_12_Find_the_number_that_appears_once_and_other_numbers_twice

    public static int getSingleElement (int [] arr) {
        // size of the array :
        int n = arr.length;

        // Find the maximum element :
        int maximum = arr[0];
        for (int i = 0; i < n; i++) {
            maximum = Math.max(maximum, arr[i]);
        }

        // Declare hash array of size maximum + 1
        // And hash the given array :

        int [] hash = new int [maximum + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // Find the single element and return the answer :
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1){
                return arr[i];
            }
        }

        // This line will never execute
        // If the array contains a single element.
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1, 1, 2, 3, 3, 4, 4};
        int result = getSingleElement(arr);

        System.out.println("The single element is : " + result);
    }
}

/*




import java.util.*;

public class tUf {
    public static int getSingleElement(int []arr) {
        //size of the array:
        int n = arr.length;

        // Find the maximum element:
        int maxi = arr[0];
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        // Declare hash array of size maxi+1
        // And hash the given array:
        int[] hash = new int[maxi + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        //Find the single element and return the answer:
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1)
                return arr[i];
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
}

 */