class Solution {
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        int dp[][][]=new int[n][2][k+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return getAns(prices,0,0,n,k,dp);
    }
    public int getAns(int prices[],int ind,int buy,int n,int cap,int dp[][][]){
        if(ind==n || cap==0){
            return 0;
        }
        if(dp[ind][buy][cap]!=-1){
            return dp[ind][buy][cap];
        }

        int profit;
        if(buy==0){
            profit=Math.max(0+getAns(prices,ind+1,0,n,cap,dp),
                                -prices[ind]+getAns(prices,ind+1,1,n,cap,dp));
        }
        else{
            profit=Math.max(0+getAns(prices,ind+1,1,n,cap,dp),
                                prices[ind]+getAns(prices,ind+1,0,n,cap-1,dp));
        }
        return dp[ind][buy][cap]=profit;
    }
}