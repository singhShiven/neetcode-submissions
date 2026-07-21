class Solution {
    public int maxProfit(int[] prices) {
        int max=0,min=0,profit;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
              profit=prices[j]-prices[i];
              max=Math.max(max,profit);
              
              
            }
            
        }
        return max;
    }
}
