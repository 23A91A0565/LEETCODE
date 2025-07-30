class Solution {
    public int longestSubarray(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i:nums)
        {
            if(i>max)
            {
                max=i;
            }
        }
        int cur_len=0;
        int max_len=0;
        for(int i:nums)
        {
            if(i==max)
            {
                cur_len++;
            }
            else{
                max_len=Math.max(max_len,cur_len);
                cur_len=0;
            }
        }
        return Math.max(cur_len,max_len);
    }
}