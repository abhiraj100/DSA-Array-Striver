package com.array;

public class St_12_Find_the_number_that_appears_once_and_other_numbers_twice {

    public static int numberThatAppearsOnce (int [] array){

        //Run a loop for selecting elements:
        for (int i = 0; i < array.length; i++) {
           int num = array[i]; // selected element
           int count = 0;

           //find the occurrence using linear search:
            for (int j = 0; j < array.length; j++) {
                if (array[j] == num) {
                    count++;
                }
            }

            // if the occurrence is 1 return num:
                if (count == 1) {
                    return num;
                }
            }
        //This line will never execute
        //if the array contains a single element.
        return -1;
    }

    public static void main(String[] args) {
        int [] array = {1, 1, 2, 3, 3, 4, 4, 5, 5};
        int result = numberThatAppearsOnce(array);

        System.out.println(result);
    }
}
/*



import java.util.*;

public class tUf {
    public static int getSingleElement(int []arr) {
        // Size of the array:
        int n = arr.length;

        //Run a loop for selecting elements:
        for (int i = 0; i < n; i++) {
            int num = arr[i]; // selected element
            int cnt = 0;

            //find the occurrence using linear search:
            for (int j = 0; j < n; j++) {
                if (arr[j] == num)
                    cnt++;
            }

            // if the occurrence is 1 return ans:
            if (cnt == 1) return num;
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