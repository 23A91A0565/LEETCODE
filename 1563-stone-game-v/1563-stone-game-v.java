class Solution {
    int dp[][];
    int pre[];
    public int stoneGameV(int[] stoneValue) {
        int n=stoneValue.length;
        dp=new int[n][n];
        for(int ele[]:dp){
            Arrays.fill(ele,-1);
        }
        pre=new int[n+1];
        for(int i=0;i<n;i++){
            pre[i+1]=pre[i]+stoneValue[i];
        }
        solve(0,n-1);
        return dp[0][n-1]==-1?0:dp[0][n-1];
    }
    public int solve(int l,int r){
        if(l==r){
            return 0;
        }
        if(dp[l][r]!=-1){
            return dp[l][r];
        }
        int ans=0;
        for(int k=l;k<r;k++){
            int left=pre[k+1]-pre[l];
            int right=pre[r+1]-pre[k+1];
            if(left<right){
                ans=Math.max(ans,left+solve(l,k));
            }
            else if(right<left){
                ans=Math.max(ans,right+solve(k+1,r));
            }
            else{
                ans=Math.max(ans,Math.max(left+solve(l,k),right+solve(k+1,r)));
            }
        }
        return dp[l][r]=ans;
    }
}