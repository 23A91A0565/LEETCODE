class Solution {
    public int minMoves(int[] nums) {
        int min=nums[0];
        int sum=0;
        for(int ele:nums){
            min=Math.min(min,ele);
            sum+=ele;
        }
        return sum-nums.length*(min);
    }
}