package com.array.hard;

import java.util.*;


public class St_29_Majority_Element_N_by_3_OPTIMAL_APPROACH {


    public static List<Integer> majorityElement(int [] v) {
        int n = v.length;  // size of the array

        int count1 = 0, count2 = 0;  // counts
        int el1 = Integer.MIN_VALUE;  // element1
        int el2 = Integer.MIN_VALUE;  // element2

        // applying the Extended Boyer Moore's Voting Algorithm :

        for (int i = 0; i < n; i++) {
            if (count1 == 0 && el2 != v[i]) {
                count1 = 1;
                el1 = v[i];
            } else if (count2 == 0 && el1 != v[i]) {
                count2 = 1;
                el2 = v[i];
            } else if (v[i] == el1) {
                count1++;
            } else if (v[i] == el2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        List<Integer> ls = new ArrayList<>();  // list of answers

        // Manually check if the stored elements in el1 and el2 are the majority elements :

        count1 = 0;
        count2 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el1) {
                count1++;
            }
            if (v[i] == el2) {
                count2++;
            }
        }

        int mini = (int)(n / 3) + 1;
        if (count1 >= mini) {
            ls.add(el1);
        }
        if (count2 >= mini) {
            ls.add(el2);
          }

            //if it is told to sort the answer array :
            // Collections.sort(ls);   // TC : O(2*log2) ~ O(1)

        return ls;
    }

    public static void main (String [] args) {
        int [] array = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = majorityElement(array);
        System.out.print("The majority elements are : ");

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}


// Time Complexity : O(N) + O(N) ==> O(2N)
// Reason : The first O(N) is to calculate the counts and find the expected majority elements. The second one is to check if the
//          calculated elements are the majority ones or not.

// Space Complexity : O(1)
