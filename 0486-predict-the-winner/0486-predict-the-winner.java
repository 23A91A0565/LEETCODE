class Solution {
    public boolean predictTheWinner(int[] nums) {
        int ans=0;
        int n=nums.length;
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        ans=solve(nums,0,n-1,dp);
        return ans>=0;
    }
    public int solve(int nums[],int l,int h,int dp[][]){
        if(l==h)return nums[l];
        if(dp[l][h]!=-1)return dp[l][h];
        int ans1=nums[l]-solve(nums,l+1,h,dp);
        int ans2=nums[h]-solve(nums,l,h-1,dp);
        return dp[l][h]=Math.max(ans1,ans2);
    }
}