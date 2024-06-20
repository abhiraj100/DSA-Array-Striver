package com.array.medium;

public class St_19_Stock_Buy_and_Sell_BetterApproach {

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int n = prices.length;

        // Arrays to store the minimum price and maximum profit at each step
        int[] minPrices = new int[n];
        int[] maxProfits = new int[n];

        // Initialize the first day
        minPrices[0] = prices[0];
        maxProfits[0] = 0;

        // Iterate through the prices to fill the arrays
        for (int i = 1; i < n; i++) {
            minPrices[i] = Math.min(minPrices[i - 1], prices[i]);
            maxProfits[i] = Math.max(maxProfits[i - 1], prices[i] - minPrices[i - 1]);
        }

        return maxProfits[n - 1];
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
    }
}
