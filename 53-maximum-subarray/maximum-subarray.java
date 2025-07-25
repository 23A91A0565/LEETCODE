class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,maxs=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            maxs=Math.max(maxs,sum);
            if(sum<0)
            {
                sum=0;
            }
        }
        return maxs;
    }
}