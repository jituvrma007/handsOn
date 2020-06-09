package easy_problems;

/**
121. Best Time to Buy and Sell Stock
Say you have an array for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:
Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
Example 2:
Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0. 
 */


public class Best_Time_to_Buy_and_Sell_Stock {
	
	// N^2 complexity
    public int maxProfit(int[] prices) {
        
    	if (prices == null || prices.length ==0) 
    		return -1;

    	int buyDay = 0;
    	int sellDay = 0;

    	int maxProfit = Integer.MIN_VALUE;
		for (int i = 0; i < prices.length - 1; i++) {
			for (int j = i; j < prices.length - 1; j++) {

				if (maxProfit < prices[j] - prices[i]) {
					maxProfit =  prices[j] - prices[i];
					buyDay = i + 1;
					sellDay = j + 1;
				}
			}
		}
    	
    	System.out.println("buyDay :: "+ buyDay+ " sellDay :: "+sellDay);
    	System.out.println("maxProfit :: "+ maxProfit);
    	return maxProfit;
    }
    
    public int maxProfitOrderN(int prices[]) {
    	if (prices == null || prices.length ==0) 
    		return 0;
    	
    	int maxprofit = 0, profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int currentProfit = prices[i] - prices[i-1];
            profit = Math.max(profit + currentProfit, currentProfit);
            maxprofit = Math.max(profit, maxprofit);
        }
    	System.out.println("maxProfit :: "+ maxprofit);
        return maxprofit;
    }
   
	public static void main(String[] args) {
		Best_Time_to_Buy_and_Sell_Stock stock =  new Best_Time_to_Buy_and_Sell_Stock();
//		stock.maxProfit(new int[] {7,6,4,3,1});
//		stock.maxProfit(new int[] {7,1,5,3,6,4});

//		stock.maxProfitOrderN(new int[] {7,6,4,3,1}); //0
		stock.maxProfitOrderN(new int[] {7,1,5,3,6,4}); //5
	}
}
