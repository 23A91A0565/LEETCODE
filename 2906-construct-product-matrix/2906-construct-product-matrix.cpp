class Solution {
public:
    vector<vector<int>> constructProductMatrix(vector<vector<int>>& grid) {
        int n=grid.size();
        int m=grid[0].size();
        vector<vector<long long>> pre(n,vector<long long>(m));
        vector<vector<long long>> suff(n,vector<long long>(m));
        int mod=12345;
        long long p=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                pre[i][j]=p;
                p=(p*grid[i][j])%mod;
            }
        }
        long long s=1;
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                suff[i][j]=s;
                s=(s*grid[i][j])%mod;
            }
        }
        vector<vector<int>>res(n,vector<int>(m));
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j]=(pre[i][j]*suff[i][j])%mod;
            }
        }
        return res;
    }
};