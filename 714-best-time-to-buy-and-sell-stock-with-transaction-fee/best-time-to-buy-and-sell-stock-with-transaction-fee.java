class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int dp[][]=new int[n][2];
        for(int ele[]:dp){
            Arrays.fill(ele,-1);
        }
        return getAns(prices,0,0,n,fee,dp);
    }
    public int getAns(int prices[],int ind,int buy,int n,int fee,int dp[][]){
        if(ind==n){
            return 0;
        }
        if(dp[ind][buy]!=-1){
            return dp[ind][buy];
        }

        int profit=0;
        if(buy==0){
            profit=Math.max(0+getAns(prices,ind+1,0,n,fee,dp),
                        -prices[ind]+getAns(prices,ind+1,1,n,fee,dp));
        }
        else{
            profit=Math.max(getAns(prices,ind+1,1,n,fee,dp),
                        prices[ind]-fee+getAns(prices,ind+1,0,n,fee,dp));
        }
        return dp[ind][buy]=profit;
    }
}