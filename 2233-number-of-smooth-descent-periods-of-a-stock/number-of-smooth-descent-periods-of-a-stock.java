class Solution {
    public long getDescentPeriods(int[] prices) {
        long res=prices.length;
        long dp[]=new long[prices.length];
        dp[0]=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1]-prices[i]==1){
                dp[i]=1+dp[i-1];
            }
            else{
                dp[i]=0;
            }
        }
        for(int i=0;i<prices.length;i++){
            res+=dp[i];
        }
        return res;
    }
}