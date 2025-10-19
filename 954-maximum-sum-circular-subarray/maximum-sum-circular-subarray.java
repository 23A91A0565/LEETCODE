class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = nums[0];
        int curMax = nums[0];
        int max = nums[0];
        int curMin = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            total += num;
            curMax = Math.max(curMax + num, num);
            max = Math.max(curMax, max);
            curMin = Math.min(curMin + num, num);
            min = Math.min(curMin, min);
        }
        if (total == min) {
            return max;
        }
        return Math.max(max, total - min);
    }
}