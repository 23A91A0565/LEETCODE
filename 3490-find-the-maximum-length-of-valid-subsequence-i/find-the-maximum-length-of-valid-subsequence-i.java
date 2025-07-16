class Solution {
    public int maximumLength(int[] nums) {
        int n = nums.length;
        int alt = 1;
        int last = nums[0] % 2;
        for (int i = 1; i < n; i++) {
            int curr = nums[i] % 2;
            if (curr != last) {
                alt++;
                last = curr;
            }
        }
        
        int evenCount = 0;
        int oddCount = 0;
        for (int num : nums) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }
        int same = Math.max(evenCount, oddCount);

        return Math.max(alt, same);
    }
}