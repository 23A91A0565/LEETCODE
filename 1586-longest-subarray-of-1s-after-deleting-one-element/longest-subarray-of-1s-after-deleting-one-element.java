class Solution {
    public int longestSubarray(int[] nums) {
        int left=0; int ans=0;
        int zeros=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==0) zeros++;
            while(zeros>1) {
                if(nums[left]==0) zeros--;
                left++;
            }
            ans=Math.max(ans,i-left+1-1);           
        }
        return ans;
    }
}