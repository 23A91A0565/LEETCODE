class Solution {
    public int backtrack(int i, int[] nums, int cur_xor, int max_xor) {
        if (i >= nums.length) {
            return cur_xor == max_xor ? 1 : 0;
        }
        int include = backtrack(i + 1, nums, cur_xor | nums[i], max_xor);
        int exclude = backtrack(i + 1, nums, cur_xor, max_xor);
        return include + exclude;
    }

    public int countMaxOrSubsets(int[] nums) {
        int max = 0;
        for (int i : nums) {
            max |= i;
        }
        return backtrack(0, nums, 0, max);
    }
}
