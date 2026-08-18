class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> freq=new HashMap<>();
        int max=nums[0];
        for(int ele:nums){
            max=Math.max(max,ele);
            freq.put(ele,freq.getOrDefault(ele,0)+1);
        }
        if(k==n){
            return max;
        }
        else if(k==1){
            int res=-1;
            for(int ele:nums){
                if(freq.get(ele)==1){
                    res=Math.max(res,ele);
                }
            }
            return res;
        }
        else{
            int res=-1;
            if(freq.get(nums[0])==1){
                res=Math.max(res,nums[0]);
            }
            if(freq.get(nums[nums.length-1])==1){
                res=Math.max(res,nums[nums.length-1]);
            }
            return res;
        }
    }
}