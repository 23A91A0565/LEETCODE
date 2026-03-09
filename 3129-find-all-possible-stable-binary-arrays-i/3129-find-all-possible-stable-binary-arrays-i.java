class Solution {
    int mod=1_000_000_007;
    public int numberOfStableArrays(int zero, int one, int limit) {
        int dp[][][]=new int[zero+1][one+1][2];
        for(int arr[][]:dp){
            for(int row[]:arr){
                Arrays.fill(row,-1);
            }
        }

        int ans=0;
        ans=(ans+cal(zero,one,limit,0,dp))%mod;
        ans=(ans+cal(zero,one,limit,1,dp))%mod;

        return ans;
    }
    public int cal(int z,int o,int l,int pre,int dp[][][]){
        if(z==0 && o==0){
            return 1;
        }
        if(z<0 || o<0)return 0;

        if(dp[z][o][pre]!=-1)return dp[z][o][pre];
        int res=0;
        if(pre==0){
            for(int i=1;i<=l && i<=z;i++){
                res=(res+cal(z-i,o,l,1,dp))%mod;
            }
        }
        else{
            for(int i=1;i<=l && i<=o;i++){
                res=(res+cal(z,o-i,l,0,dp))%mod;
            }
        }
        return dp[z][o][pre]=res;
    }
}