class Solution {
    public int specialTriplets(int[] nums) {
        final int MOD = 1_000_000_007;
        final int MAX = 200000;
        int n=nums.length;
        long res=0;
        int rightFre[]=new int[MAX+1];
        int leftFre[]=new int[MAX+1];
        for(int i:nums)rightFre[i]++;
        for(int i:nums){
            rightFre[i]--;
            int target=2*i;
            if(target<=MAX){
                res=(res+ (long)leftFre[target]*rightFre[2*i]) % MOD;
            }
            leftFre[i]++;
        }
        return (int)res;
    }
}