/**
 * Problem: Best Time to Buy and Sell Stock
 *
 * Given an array of stock prices where the index represents the day,
 * you are allowed to buy once and sell once.
 * Your task is to find the maximum profit you can achieve.
 *
 * Example:
 * Input: [7, 1, 5, 3, 6, 4]
 * Output: 5
 * Explanation: Buy at price 1 and sell at price 6 → Profit = 6 - 1 = 5
 */

public class  Best_TymTo_BuySell_Stock {

    public static void main(String[] args) {
        // Sample input: prices of stock on each day
        int[] prices = {7, 1, 5, 3, 6, 4};

        // Initialize the minimum price seen so far to a very large value
        int minPrice = Integer.MAX_VALUE;

        // Initialize the maximum profit to 0
        int maxProfit = 0;

        // Iterate through each day's stock price
        for (int i = 0; i < prices.length; i++) {
            // If the current price is less than the minimum seen so far, update minPrice
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate potential profit if we sell at current price
            int profit = prices[i] - minPrice;

            // Update maxProfit if this profit is greater than the previous max
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        // Output the maximum profit found
        System.out.println("Maximum Profit: " + maxProfit);
    }
}
