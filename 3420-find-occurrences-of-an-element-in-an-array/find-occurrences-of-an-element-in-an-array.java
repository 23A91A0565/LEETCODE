class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> occurrences = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                occurrences.add(i);
            }
        }

        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int k = queries[i];
            if (k <= occurrences.size()) {
                res[i] = occurrences.get(k - 1);
            } else {
                res[i] = -1;
            }
        }

        return res;
    }
    
}