class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> l=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            l.put(nums[i],l.getOrDefault(nums[i],0)+1);
        }

        int max_length=0;
        for(int i:l.keySet())
        {
            if(l.containsKey(i+1))
            {
                int length=l.get(i)+l.get(i+1);
                max_length=Math.max(max_length,length);
            }
        }
        return max_length;
    }
}