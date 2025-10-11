class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        int mid=nums[(0+nums.length)/2];
        for(int i=0;i<nums.length;i++){
            res+=Math.abs(mid-nums[i]);
        }
        return res;
    }
}