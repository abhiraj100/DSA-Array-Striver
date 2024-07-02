package com.array.hard;

import java.util.*;

public class St_30_Three_Sum_OPTIMAL_APPROACH {
    public static List<List<Integer>>  triplet (int n, int [] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            // remove duplicates :
            if (i != 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            // moving 2 pointers :
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(temp);
                    j++;
                    k--;

                    // skip the duplicates :
                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }

                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] array = {-1, 0, 1, 2, -1, -4};
        int n = array.length;
        List<List<Integer>> ans = triplet(n, array);
        for (int j = 0; j < ans.size(); j++) {
            List<Integer> it = ans.get(j);
            System.out.print("[");
            for (int i = 0; i < it.size(); i++) {
                System.out.print(it.get(i) + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}

/*
Time Complexity: O(NlogN)+O(N2), where N = size of the array.
Reason: The pointer i, is running for approximately N times. And both the pointers j and k combined can run for
        approximately N times including the operation of skipping duplicates. So the total time complexity will be O(N2).

Space Complexity: O(no. of quadruplets), This space is only used to store the answer. We are not using any extra
                  space to solve this problem. So, from that perspective, space complexity can be written as O(1).
 */