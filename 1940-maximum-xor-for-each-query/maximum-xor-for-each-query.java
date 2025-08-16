class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n=nums.length;
        int maxxor=(1<<maximumBit)-1;
        int total_xor=nums[0];
        for(int i=1;i<n;i++)
        {
            total_xor^=nums[i];
        }
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            int k=total_xor^maxxor;
            total_xor^=nums[n-i-1];
            res[i]=k;
        }
        return res;
    }
}