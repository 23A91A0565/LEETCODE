class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        int dp[][]=new int[n][m];
        for(int ele[]:dp){
            Arrays.fill(ele,Integer.MIN_VALUE);
        }
        return solve(0,0,nums1,nums2,dp);
    }

    public int solve(int i,int j,int nums1[],int nums2[],int dp[][]){
        if(i>=nums1.length || j>=nums2.length){
            return Integer.MIN_VALUE;
        }
        if(dp[i][j]!=Integer.MIN_VALUE){
            return dp[i][j];
        }
        int ans=nums1[i]*nums2[j];
        int next=solve(i+1,j+1,nums1,nums2,dp);
        if(next!=Integer.MIN_VALUE){
            ans=Math.max(ans,ans+next);
        }

        ans=Math.max(ans,solve(i+1,j,nums1,nums2,dp));
        ans=Math.max(ans,solve(i,j+1,nums1,nums2,dp));

        return dp[i][j]=ans;
    }
}