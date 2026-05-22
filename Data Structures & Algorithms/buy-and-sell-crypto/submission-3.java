class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];

        for(int i : prices){
            profit = Math.max(profit, i - buy);
            buy = Math.min(buy, i);
        }

        return profit;
    }
}
