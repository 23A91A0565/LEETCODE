class Solution {
    public int longestSubarray(int[] nums) {
        int max=0,c=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]+nums[i+1]==nums[i+2]){
                c+=1;
            }
            else{
                max=Math.max(max,c+2);
                c=0;
            }
        }
        return Math.max(max,c+2);
    }
}