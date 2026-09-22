class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int ans=0;
        h.put(0,1);
        int pre=0;
        for(int ele:nums){
            pre+=ele;
            int req=pre-k;
            if(h.containsKey(req)){
                ans+=h.get(req);
            }
            h.put(pre,h.getOrDefault(pre,0)+1);
        }
        return ans;
    }
}