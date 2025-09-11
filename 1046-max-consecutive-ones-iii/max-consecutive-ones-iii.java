class Solution {
    public int longestOnes(int[] nums, int k) {
        int zero=0;
        int max=0,l=0,r=0;
        for(r=0;r<nums.length;r++){
            if(nums[r]==0){
                zero++;
            }
            if(zero>k){
                while(zero>k){
                    if(nums[l]==0)zero--;
                    l++;
                }
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}