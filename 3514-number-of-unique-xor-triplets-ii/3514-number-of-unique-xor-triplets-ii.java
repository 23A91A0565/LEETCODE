class Solution {
    public int uniqueXorTriplets(int[] nums) {
        // because here the maximum n is 1500
        // and bitlength(1500) will be the 11 atmost so 2^11 = 2047
        boolean pair[]=new boolean[2048];
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                pair[nums[i]^nums[j]]=true;
            }
        }
        boolean ans[]=new boolean[2048];
        for(int x=0;x<2048;x++){
            if(!pair[x])continue;
            for(int num:nums){
                ans[x^num]=true;
            }
        }
        int res=0;
        for(int i=0;i<2048;i++){
            if(ans[i])res++;
        }
        return res;
    }
}