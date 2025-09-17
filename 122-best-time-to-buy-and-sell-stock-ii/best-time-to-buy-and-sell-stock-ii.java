class Solution {
    public int maxProfit(int[] prices) {
        int i=0,res=0;
        while(i<prices.length-1){
            while(i<prices.length-1 && prices[i]>=prices[i+1]){
                i++;
            }
            int buy=prices[i];
            while(i<prices.length-1 && prices[i]<=prices[i+1]){
                i++;
            }
            int sell=prices[i];
            res+=sell-buy;
        }
        return res;
    }
}