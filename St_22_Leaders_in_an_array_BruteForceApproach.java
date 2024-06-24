package com.array.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class St_22_Leaders_in_an_array_BruteForceApproach {

    public static ArrayList<Integer>
    printLeadersBruteForce(int[] arr, int n){

        ArrayList<Integer> ans= new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean leader = true;

            //Checking whether arr[i] is greater than all
            //the elements in its right side
            for (int j = i + 1; j < n; j++)
                if (arr[j] > arr[i]) {

                    // If any element found is greater than current leader
                    // curr element is not the leader.
                    leader = false;
                    break;
                }

            // Push all the leaders in ans array.
            if (leader)
                ans.add(arr[i]);
        }

        return ans;

    }

    public static void main(String args[])
    {
        // Array Initialization.
        int n = 6;
        int [] arr=  {10, 22, 12, 3, 0, 6};


        ArrayList<Integer> ans= printLeadersBruteForce(arr,n);

        System.out.print("[ ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }

        System.out.println(" ]");
    }
}


// Time Complexity : O (N^2)  { Since there are nested loops being used, at the worst case n^2 time would be consumed }.
// Space Complexity : O (N)  { There is no extra space being used in this approach. But, a O(N) of space for ans array will be used in the worst case }.