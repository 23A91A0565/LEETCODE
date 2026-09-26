class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            curr=Math.max(nums[i],curr+nums[i]);
            max=Math.max(max,curr);
        }
        return max;
    }
}