class Solution {
    public int findMaxK(int[] nums) {
        int res=-1;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(ans.contains(-nums[i]) ){
                res=Math.max(res,Math.abs(nums[i]));
            }
            ans.add(nums[i]);
        }
        return res;
    }
}