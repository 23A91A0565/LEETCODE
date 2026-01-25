class Solution {
    public int minimumPrefixLength(int[] nums) {
        int c=0; 
        if(isIncrease(nums))return c; 
        for(int i=1;i<nums.length;i++){ 
            if(nums[i]<=nums[i-1]){ c=i; 
            } 
        } 
        return c; 
    }
    public boolean isIncrease(int nums[]){ 
        for(int i=0;i<nums.length-1;i++){ 
            if(nums[i]>=nums[i+1]){ 
                return false; 
                } 
        } 
        return true;
    }
}