package com.array;

import java.util.LinkedHashSet;

public class St4_Remove_Duplicates_From_Sorted_Array_Brute {

        public static void main(String[] args) {
            int[] arr = {1, 1, 2, 2, 2, 3, 3};

            // Using LinkedHashSet to remove duplicates in-place
            LinkedHashSet<Integer> set = new LinkedHashSet<>();
            for (int value : arr) {
                set.add(value);
            }

            // Converting the set back to an array
            int index = 0;
            for (int value : set) {
                arr[index++] = value;

                /*
                 index = 0;
                 for(auto it : set)
                 {
                   arr[index] = it;
                   index++;
                 }
                 */
            }

            // Printing the array after removing duplicates
            System.out.println("Array after removing duplicates: ");
            for (int i = 0; i < index; i++) {
                System.out.print(arr[i] + " ");
            }
        }

}
