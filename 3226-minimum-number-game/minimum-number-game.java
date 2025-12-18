class Solution {
    public int[] numberGame(int[] nums) {
        int res[]=new int[nums.length];
        int idx=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i=i+2){
            res[idx++]=nums[i+1];
            res[idx++]=nums[i];
        }
        return res;
    }
}