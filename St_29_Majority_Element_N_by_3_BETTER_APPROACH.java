package com.array.hard;

import java.util.*;

public class St_29_Majority_Element_N_by_3_BETTER_APPROACH {


    public static List<Integer> majorityElement(int [] v) {
        int n =  v.length;  // size of the array
        List<Integer> ls = new ArrayList<>();  // list the answers

        // declaring a map :
        HashMap<Integer, Integer> mpp = new HashMap<>();

        // least occurrence of the majority element :
        int mini = (int)(n / 3) + 1;

        // storing the elements with its occurrence :
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);

            // Checking if v[i] is the majority element :
            if (mpp.get(v[i]) == mini) {
                ls.add(v[i]);
            }

            if (ls.size() == 2) {
                break;
            }
        }
        return ls;
    }

    public static void main (String [] args) {
        int [] array = {1, 1, 2, 2, 1, 3, 2, 1};
        List<Integer> ans = majorityElement(array);
        System.out.print("The majority elements are : ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}

// Time Complexity : O(N*logN)
// Reason :We are using a map data structure. Insertion in the map takes logN time. And we doing it for N elements.
//         So, it results in the first term O(N*logN).
//         If we use unordered_map instead, the first term will be O(N) for the best and average case and for the worst case, it will be O(N^2).

// Space Complexity : O(N)

