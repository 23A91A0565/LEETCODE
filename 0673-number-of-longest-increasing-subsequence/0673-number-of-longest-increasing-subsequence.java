class Solution {
    public int findNumberOfLIS(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,1);
        int ct[]=new int[nums.length];
        Arrays.fill(ct,1);
        int max=0,res=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j] && dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    ct[i]=ct[j];
                }
                else if(nums[i]>nums[j] && dp[i]==dp[j]+1){
                    ct[i]=ct[i]+ct[j];
                }
            }
            max=Math.max(max,dp[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(dp[i]==max){
                res+=ct[i];
            }
        }
        return res;
    }
}