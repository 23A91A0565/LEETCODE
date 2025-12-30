class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int l=0,r=0,pre=0;
        for(r=0;r<nums.length;r++){
            pre+=nums[r];
            while(pre>=target){
                min=Math.min(min,r-l+1);
                pre-=nums[l];
                l++;
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}