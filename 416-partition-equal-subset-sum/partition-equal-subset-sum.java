class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0)return false;
        int target=sum/2;
        int dp[][]=new int[nums.length][target+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        if(isExist(nums,target,nums.length-1,dp))return true;
        return false;
    }
    public boolean isExist(int nums[],int target,int index,int dp[][]){
        if(target==0)return true;
        if(index==0)return nums[index]==target;
        if(dp[index][target]!=-1)
            return dp[index][target]==1;
        boolean notake=isExist(nums,target,index-1,dp);
        boolean take=false;
        if(nums[index]<=target){
            take=isExist(nums,target-nums[index],index-1,dp);
        }
        dp[index][target]=(take||notake)?1:0;
        return dp[index][target]==1;
    }
}