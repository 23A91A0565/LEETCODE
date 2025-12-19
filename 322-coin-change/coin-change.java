class Solution{
    public int coinChange(int[] coins,int amount){
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] row:dp)Arrays.fill(row,-1);
        int INF=(int)1e9;
        int ans=calculate(coins,amount,dp,n-1);
        return ans>=INF?-1:ans;
    }

    public int calculate(int[] coins,int amount,int[][] dp,int index){
        int INF=(int)1e9;
        if(amount==0)return 0;
        if(index==0){
            if(amount%coins[0]==0)return amount/coins[0];
            else return INF;
        }
        if(dp[index][amount]!=-1)return dp[index][amount];

        int notTaken=calculate(coins,amount,dp,index-1);
        int taken=INF;
        if(coins[index]<=amount){
            taken=1+calculate(coins,amount-coins[index],dp,index);
        }
        dp[index][amount]=Math.min(taken,notTaken);
        return dp[index][amount];
    }
}
