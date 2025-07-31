class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> ans=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            ans.add(nums[i]);
            StringBuilder sb=new StringBuilder(String.valueOf(nums[i]));
            sb.reverse();
            String s=sb.toString();
            ans.add(Integer.parseInt(s));
        }
        return ans.size();
    }
}