package com.lsl.array;
/**
 *   买卖股票的最佳时机 II
 *   Say you have an array for which the ith element is the price of a given stock on day i.
 *   Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 *   
 *   Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 *   
 *   Example 1:
 *   put: [7,1,5,3,6,4]
 *   Output: 7
 *   
 *   Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 *   Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 *   Example 2:
 *   Input: [1,2,3,4,5]
 *   Output: 4
 *   Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 *   Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
 *   engaging multiple transactions at the same time. You must sell before buying again.
 *   Example 3:
 *   Input: [7,6,4,3,1]
 *   Output: 0
 *   Explanation: In this case, no transaction is done, i.e. max profit = 0.
 * @author liush
 *
 */
public class MaxProfit {

	public static void main(String[] args) {
		int[] a = new int[] {7,1,4,5,3,6,4};
		int[] b = new int[] {1,2,3,4,5};
		int[] c = new int[] {7,6,4,3,1};
		System.out.println(maxProfit2(a));
		System.out.println(maxProfit2(b));
		System.out.println(maxProfit2(c));
	}
	
	public static int maxProfit(int[] prices) {
		int sum = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			int price = prices[i + 1] - prices[i];
			if( price > 0) {
				sum += price;
			}
		}
		return sum;
	}
	public static int maxProfit2(int[] prices) {
		int sum = 0;
		int buy = 0;
		int sell = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			int price = prices[i + 1] - prices[i];
			if( price > 0) {
				sell += prices[i];
				sum += sell;
			}else if(price < 0) {
				buy += prices[i + 1];
				sum -= buy;
			}
		}
		return sum;
	}
//System.out.println("sum = " + sum + " ; max = " + max + " ; min = " + min);
}
