class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int []res=new int[n];
        int totalSum=0;
        for(int num:nums)
        {
            totalSum+=num;
        }
        int leftSum=0;
        for(int i=0;i<n;i++){
            int rightSum = totalSum - leftSum - nums[i]; 
            int leftDiff = nums[i] * i - leftSum;                  
            int rightDiff = rightSum - nums[i] * (n - i - 1);
            res[i] = leftDiff + rightDiff;
            leftSum += nums[i];
            
        }
        return res;
    }
}