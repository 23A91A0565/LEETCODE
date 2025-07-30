class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]%2;
        }
        HashMap<Integer,Integer> ans=new HashMap<>();
        ans.put(0,1);
        int c=0;
        int pre=0;
        for(int i=0;i<nums.length;i++)
        {
            pre+=nums[i];
            if(ans.containsKey(pre-k))
            {
                c+=ans.get(pre-k);
            }
            ans.put(pre,ans.getOrDefault(pre,0)+1);
        }
        return c;
    }
}