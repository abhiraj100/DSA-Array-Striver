package com.array.medium;

public class St_19_Stock_Buy_and_Sell_OptimalApproach {

    public static int maxProfit(int [] arr) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            maxPro = Math.max(maxPro, arr[i] - minPrice);
        }
        return maxPro;
    }

    public static void main(String[] args) {
        int [] array = {7, 1, 5, 3, 6, 4};
        int maxProfitOfStock = maxProfit(array);
        System.out.println("Max Profit is :" + maxProfitOfStock);
    }
}
