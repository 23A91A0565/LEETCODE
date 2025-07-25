class Solution {
    public int maxSum(int[] nums) {
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        int maxNeg = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            } else {
                maxNeg = Math.max(maxNeg, num);
            }
        }

        for (int val : set) {
            sum += val;
        }

        return set.size() > 0 ? sum : maxNeg;
    }
}