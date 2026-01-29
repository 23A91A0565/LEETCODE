class Solution {
    public int subarraySum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int j=Math.max(0,i-nums[i]);
            for(;j<=i;j++){
                sum+=nums[j];
            }
        }
        return sum;
    }
}