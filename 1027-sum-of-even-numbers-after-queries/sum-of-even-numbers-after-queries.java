class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int res[]=new int[queries.length];
        int sum=0;
        for(int i:nums)
        {
            if(i%2==0)
            {
                sum+=i;
            }
        }
        for(int i=0;i<queries.length;i++)
        {
            int f=queries[i][0];
            int s=queries[i][1];
            if(nums[s]%2 ==0)
            {
                sum-=nums[s];
            }
            nums[s]+=f;
            if(nums[s]%2==0)
            {
                sum+=nums[s];
            }
            res[i]=sum;
        }
        return res;
    }
}