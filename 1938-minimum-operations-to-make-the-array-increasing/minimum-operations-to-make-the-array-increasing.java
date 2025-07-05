class Solution {
    public int minOperations(int[] nums) {
        
    	int count = 0;
    	for (int i = 0; i < nums.length-1; i++) {
    		if(nums[i] >= nums[i+1]) {
                int diff = nums[i] - nums[i + 1] + 1;
    			count += diff;
    			nums[i+1] += diff;
    		}
    		
		}
    	return count;
    }
}