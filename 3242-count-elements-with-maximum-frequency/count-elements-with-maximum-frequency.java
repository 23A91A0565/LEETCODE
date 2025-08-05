class Solution {
    public int maxFrequencyElements(int[] nums) {
        int m=Integer.MIN_VALUE;
        int c=0;
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            ans.put(nums[i],ans.getOrDefault(nums[i],0)+1);
            m=Math.max(m,ans.get(nums[i]));
        }
        for(int i:ans.values())
        {
            if(i==m)
            {
                c+=i;
            }
        }
        return c;
    }
}