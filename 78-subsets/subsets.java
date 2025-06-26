class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int totalSubsets = 1 << n;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < totalSubsets; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) list.add(nums[j]);
            }
            ans.add(list);
        }
        return ans;  
    }
}