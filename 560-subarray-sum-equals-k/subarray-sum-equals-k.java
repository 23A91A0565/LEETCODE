class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        ans.put(0,1);
        int pre=0;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            pre+=nums[i];
            int req=pre-k;
            if(ans.containsKey(req))
            {
                c+=ans.get(req);
            }
            ans.put(pre,ans.getOrDefault(pre,0)+1);
        }
        return c;
    }
}