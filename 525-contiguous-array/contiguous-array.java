class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        ans.put(0,-1);
        int res=0;
        int pre=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                pre-=1;
            }
            else{
                pre+=1;
            }
            if(ans.containsKey(pre)){
                res=Math.max(res,i-ans.get(pre));
            }
            else{
                ans.put(pre,i);
            }
        }
        return res;
    }
}