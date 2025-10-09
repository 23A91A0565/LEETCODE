class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(n, ans, new ArrayList<>(), 1,k);
        return ans;
    }

    private void backtrack(int target, List<List<Integer>> ans, List<Integer> current, int start,int size) {
        if (target == 0 && current.size()==size) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (i > target) break;
            current.add(i);
            backtrack(target - i, ans, current, i + 1,size);
            current.remove(current.size() - 1);
        }
    }
}