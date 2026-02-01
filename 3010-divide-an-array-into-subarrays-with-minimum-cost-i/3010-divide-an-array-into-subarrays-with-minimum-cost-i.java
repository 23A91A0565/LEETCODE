class Solution {
    public int minimumCost(int[] nums) {
        int res=nums[0];
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1;i<nums.length;i++){
            ans.add(nums[i]);
        }
        Collections.sort(ans);
        res+=ans.get(0);
        res+=ans.get(1);
        return res;
    }
}