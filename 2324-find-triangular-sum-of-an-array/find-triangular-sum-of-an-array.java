class Solution {
    public int triangularSum(int[] nums) {

        int n = nums.length;
        while (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
            n--; 
        }
        return nums[0]; 

        //  [OR]

       /* if(nums.length==1)
        {
            return nums[0];
        }
        else{
        int ans[]=helper(nums);
        return ans[0];
        }
    }
    public static int[] helper(int[] nums)
    {
        int ans[]=new int[nums.length-1];
        int j=0;
        for(int i=0;i<nums.length-1;i++)
        {
            ans[j]=(nums[i]+nums[i+1])%10;
            j++;
        }
        if(ans.length>1)
        {
            return helper(ans);
        }
        else{
            return ans;
        }*/

    }
}