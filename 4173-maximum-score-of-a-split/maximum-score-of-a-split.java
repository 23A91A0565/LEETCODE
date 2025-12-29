class Solution {
    public long maximumScore(int[] nums) {
        long prefix[]=new long[nums.length];
        long suffMin[]=new long[nums.length];
        prefix[0]=nums[0];
        suffMin[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            suffMin[i]=Math.min(suffMin[i+1],nums[i]);
        }
        long max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(max,prefix[i]-suffMin[i+1]);
        }
        return max;
    }
}