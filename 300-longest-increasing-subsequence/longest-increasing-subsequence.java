class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[][]=new int[n][n+1];
        for(int ele[]:dp){
            Arrays.fill(ele,-1);
        }
        return calculate(nums,0,-1,dp);
    }
    public int calculate(int nums[],int curr,int prev,int dp[][]){
        if(curr==nums.length-1){
            if(prev==-1 || nums[curr]>nums[prev])return 1;
            return 0;
        }

        if(dp[curr][prev+1]!=-1)return dp[curr][prev+1];

        int notake=calculate(nums,curr+1,prev,dp);
        int take=0;
        
        if(prev==-1 || nums[curr]>nums[prev]){
            take=calculate(nums,curr+1,curr,dp)+1;
        }
        return dp[curr][prev+1]=Math.max(take,notake);
    }
}