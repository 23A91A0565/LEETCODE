class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, ans, new ArrayList<>(), 0);
        return ans;
    }

    public void backtrack(int[] nums, int target, List<List<Integer>> ans, List<Integer> current, int start) {
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            if (nums[i] > target) break;
            current.add(nums[i]);
            backtrack(nums, target - nums[i], ans, current, i + 1);
            current.remove(current.size() - 1);
        }
    }
}
