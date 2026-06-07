class Solution {
    public int[] leftRightDifference(int[] nums) {
        int a[]=new int[nums.length];
        int b[]=new int[nums.length];
        a[0]=0;
        b[nums.length-1]=0;
        int ans[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            a[i]=sum;
            sum+=nums[i];
        }
        sum=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            b[i]=sum;
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=Math.abs(a[i]-b[i]);
        }
        return ans;
    }
}