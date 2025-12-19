class Solution{
    public int change(int amount,int[] coins){
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return calculate(coins,amount,dp,n-1);
    }
    public int calculate(int[] coins,int amount,int[][] dp,int index){
        if(amount==0)return 1;
        if(index==0){
            return amount%coins[0]==0?1:0;
        }
        if(dp[index][amount]!=-1)return dp[index][amount];
        int notTaken=calculate(coins,amount,dp,index-1);
        int taken=0;
        if(coins[index]<=amount){
            taken=calculate(coins,amount-coins[index],dp,index);
        }
        dp[index][amount]=taken+notTaken;
        return dp[index][amount];
    }
}
