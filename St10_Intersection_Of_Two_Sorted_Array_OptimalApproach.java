package com.array;

import java.util.ArrayList;
import java.util.Arrays;

public class St10_Intersection_Of_Two_Sorted_Array_OptimalApproach {

    public static ArrayList<Integer> findArrayIntersection(int [] arr1, int [] arr2){
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                i++;
            }
            else if (arr2[j] < arr1[i]){
                j++;
            }
            else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 3, 4, 5, 6};
        int [] arr2 = {2, 3, 3, 5, 6, 6, 7};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        ArrayList<Integer> ans = findArrayIntersection(arr1, arr2);
        System.out.println("Array after Intersection ");
        System.out.println(ans);
        System.out.println(ans.toString());
    }
}

// Time Complexity : O(n1 + n2)
// Space Complexity : O(1)