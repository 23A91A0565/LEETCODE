class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        backtrack(nums, 0, new ArrayList<>(), ans);
        return new ArrayList<>(ans);
    }

    private void backtrack(int[] nums, int index, List<Integer> current, Set<List<Integer>> ans) {
        if (current.size() >= 2) {
            ans.add(new ArrayList<>(current));
        }
        for (int i = index; i < nums.length; i++) {
            if (current.isEmpty() || nums[i] >= current.get(current.size() - 1)) {
                current.add(nums[i]);
                backtrack(nums, i + 1, current, ans);
                current.remove(current.size() - 1);
            }
        }
    }
}
