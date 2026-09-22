class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(0,-1);
        int ans=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                sum+=1;
            }
            else{
                sum-=1;
            }

            if(h.containsKey(sum)){
                ans=Math.max(ans,i-h.get(sum));
            }
            else{
                h.put(sum,i);
            }
        }
        return ans;
    }
}