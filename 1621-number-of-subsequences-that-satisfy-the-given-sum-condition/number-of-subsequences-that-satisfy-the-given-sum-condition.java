class Solution {
    public int numSubseq(int[] nums, int target) {
        int MOD = 1_000_000_007;
        int n = nums.length;
        Arrays.sort(nums);
        int[] power = new int[n];
        power[0] = 1;
        for (int i = 1; i < n; i++) {
            power[i] = (power[i - 1] * 2) % MOD;
        }

        int left = 0, right = n - 1, ans = 0;

    
        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
    
                ans = (ans + power[right - left]) % MOD;
                left++;
            } else {
                right--;
            }
        }

        return ans;
    }
}