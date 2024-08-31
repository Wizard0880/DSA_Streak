class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxi = 0;
        int n = prices.length;

        for(int i = 0 ; i < n;i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxi = Math.max(maxi,profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxi;
    }
}