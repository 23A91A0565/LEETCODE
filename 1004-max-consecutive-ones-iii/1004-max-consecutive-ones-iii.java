class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans=0;
        int zeros=0;
        int j=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]==0){
                zeros++;
            }
            while(zeros>k){
                if(nums[j]==0){
                    zeros--;
                }
                j++;
            }
            ans=Math.max(ans,i-j+1);
            i++;
        }
        return ans;
    }
}