class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    int n=nums.length;
    int subsets=1<<n;
    for(int i=0;i<subsets;i++)
    {
        List<Integer> al = new ArrayList<>();
        for(int j=0;j<n;j++)
        {
            if((i&(1<<j))!=0)
            {
               al.add(nums[j]);
            }
            Collections.sort(al);
        }
        if(!res.contains(al))
        res.add(al);
    }
    return res;

    }
}