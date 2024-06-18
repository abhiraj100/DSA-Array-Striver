package com.array;

import java.util.*;

public class St10_Intersection_Of_Two_Sorted_Array_BruteForce {

    public static ArrayList<Integer> findArrayIntersection(int [] arr1, int [] arr2){
        ArrayList<Integer> ans = new ArrayList<>();
        // to maintain visited
        int [] visited = new int[arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] ==  arr2[j] && visited[j] == 0){
                    // if element matches and has not been matched with any other before
                    ans.add(arr1[i]);
                    visited[j] = 1;
                    break;
                } else if (arr2[j] > arr1[i]) {
                    break;
                    // because array is sorted , element wil not be beyond this
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // Array Initalisation.
        int [] arr1 = {1, 2, 2, 3, 3, 4, 5, 6};
        int [] arr2 = {2, 3, 3, 5, 6, 6, 7};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        ArrayList<Integer> ans = findArrayIntersection(arr1, arr2);
        System.out.println("Array after intersecting the two array ");
        System.out.println(ans.toString());
        System.out.println(ans);


        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

    }
}

// Time Complexity : O(n1*n2) in worst case =>> O(n^2)
// Space Complexity : O(n2) in worst case =>> O(n)
