package com.array.hard;

import java.util.*;


public class St_30_Three_Sum_BETTER_APPROACH {
    public static List<List<Integer>> triplet(int n, int [] arr) {
        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                // Calculate the 3rd element :
                int third = - (arr[i] + arr[j]);

                // Find the element in the set:
                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    temp.sort(null);
                    st.add(temp);
                }
                hashset.add(arr[j]);
            }
        }

        // Store the set elements in the answer :
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    public static void main(String[] args) {
        int [] array = {-1, 0, 1, 2, -1, -4};
        int n = array.length;
        List<List<Integer>> ans = triplet(n, array);

//        for (List<Integer> it : ans) {
//            System.out.print("[");
//            for (Integer i : it) {
//                System.out.print(i + " ");
//            }
//            System.out.print("] ");


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
Time Complexity: O(N2 * log(no. of unique triplets)), where N = size of the array.
Reason: Here, we are mainly using 3 nested loops. And inserting triplets into the set takes O(log(no. of unique triplets)) time complexity. But we are not considering the time complexity of sorting as we are just sorting 3 elements every time.

Space Complexity: O(2 * no. of the unique triplets) + O(N) as we are using a set data structure and a list to store the triplets and extra O(N) for storing the array elements in another set.
 */