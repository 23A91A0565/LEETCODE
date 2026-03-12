class Solution {
public:
    int minCost(int n) {
        vector<int>dp(n+1,-1);
        int ans=cal(n,dp);
        return ans;
    }
    int cal(int n,vector<int>& dp){
        if(n==1)return 0;
        if(n==2)return 1;
        if(dp[n]!=-1)return dp[n];
        int l=0,r=0;

        if(n%2==0){
            l=n/2;
            r=n/2;
        }
        else{
            l=(int)n/2;
            r=n-l;
        }
        return dp[n]=(l*r)+cal(l,dp)+cal(r,dp);

    }
};