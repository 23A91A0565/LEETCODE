class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left=0,right=0;
        int res=0;
        HashMap<Integer,Integer> ans=new HashMap<>();
        while(right<nums.length){
            ans.put(nums[right],ans.getOrDefault(nums[right],0)+1);
            while(ans.get(nums[right])>k){
                ans.put(nums[left],ans.get(nums[left])-1);
                left++;
            }
            res=Math.max(res,right-left+1);
            right++;
        }
        return res;
    }
}