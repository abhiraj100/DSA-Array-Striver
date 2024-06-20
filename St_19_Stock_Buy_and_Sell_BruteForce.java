package com.array.medium;

import java.util.*;

public class St_19_Stock_Buy_and_Sell_BruteForce {

    public static int maxProfit(int [] arr) {
        int maxPro = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[j] > arr[i]) {
                    maxPro = Math.max(arr[j] - arr[i] , maxPro);
                }
            }
        }
        return maxPro;
    }

    public static void main(String[] args) {
        int [] array = {7, 1, 5, 3, 6, 4};
        int maxProfitOfStock = maxProfit(array);
        System.out.println("Max Profit is : " + maxProfitOfStock);

    }
}
