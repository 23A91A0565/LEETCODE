class Solution {
    public int numOfPairs(String[] nums, String target) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                String s1=nums[i];
                String s2=nums[j];
                if((s1+s2).equals(target) && i!=j)
                {
                    c+=1;
                }
            }
        }
        return c;
    }
}