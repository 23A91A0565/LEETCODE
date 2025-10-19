class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int c_max = nums[0], max = nums[0];
        int c_min = nums[0], min = nums[0];
        int total = nums[0];
        for(int i=1;i<nums.length;i++){
            c_max=Math.max(nums[i],c_max+nums[i]);
            max=Math.max(max,c_max);
            c_min=Math.min(nums[i],c_min+nums[i]);
            min=Math.min(min,c_min);
            total+=nums[i];
        }
        if(max<0)return max;
        return Math.max(max,total-min);
    }
}