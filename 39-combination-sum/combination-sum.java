class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates, target, ans, new ArrayList<>(), 0, 0);
        return ans;
    }

    private void backtrack(int[] nums, int target,List<List<Integer>> ans,List<Integer> current,
int index,int c_sum) {
        if (c_sum == target) {
            ans.add(new ArrayList<>(current));
            return;
        }
        if (c_sum > target || index >= nums.length) {
            return;
        }
        current.add(nums[index]);
        backtrack(nums, target, ans, current, index, c_sum + nums[index]);
        current.remove(current.size() - 1);
        backtrack(nums, target, ans, current, index + 1, c_sum);
    }
}