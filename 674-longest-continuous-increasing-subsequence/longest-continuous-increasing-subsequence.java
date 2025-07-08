class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max=0;
        int len=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]>nums[i])
            {
                len+=1;
            }
            else{
                max=Math.max(max,len);
                len=1;
            }
        }
        return Math.max(max,len);
    }
}