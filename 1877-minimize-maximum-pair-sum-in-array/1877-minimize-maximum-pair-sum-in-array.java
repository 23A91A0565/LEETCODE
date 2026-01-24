class Solution {
    public int minPairSum(int[] nums) {
        int max=0;
        Arrays.sort(nums);
        int n=nums.length;
        int i=0,j=n-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            max=Math.max(max,sum);
            i++;
            j--;
        }
        return max;
    }
}