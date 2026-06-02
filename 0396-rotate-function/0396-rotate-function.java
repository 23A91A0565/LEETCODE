class Solution {
    public int maxRotateFunction(int[] nums) {
        int sum=0;
        int pro=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            pro=pro+(i*nums[i]);
        }
        int max=pro;
        for(int i=1;i<nums.length;i++){
            pro+=sum-nums.length*nums[nums.length-i];
            max=Math.max(max,pro);
        }
        return max;
    }
}