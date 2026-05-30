class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max=nums[n-1];
        if(n!=max+1)return false;
        for(int i=1;i<max;i++){
            if(nums[i-1]!=i)return false;
        }
        if(nums[n-2]!=max)return false;
        if(nums[n-1]!=max)return false;
        return true;
    }
}