class Solution {
public:
    int MOD = 1e9+7;
    int countRoutes(vector<int>& locations, int start, int finish, int fuel) {
        int res=0;
        int n=locations.size();
        vector<vector<int>>dp(n,vector<int>(fuel+1,-1));
        res=cal(locations,start,finish,fuel,dp);
        return res;
    }
    int cal(vector<int>& l,int st,int f,int fuel,vector<vector<int>>& dp){
        if(fuel<0)return 0;

        if(dp[st][fuel]!=-1)return dp[st][fuel];
        long long res=(st==f)?1:0;

        for(int i=0;i<l.size();i++){
            if(st!=i){
                int cost=abs(l[st]-l[i]);
                if(cost<=fuel){
                    res=(res+cal(l,i,f,fuel-cost,dp))%MOD;
                }
            }
        }

        return dp[st][fuel]=res;
    }
};