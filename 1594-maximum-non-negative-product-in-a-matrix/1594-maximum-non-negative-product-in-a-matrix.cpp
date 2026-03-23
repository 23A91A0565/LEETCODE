class Solution {
public:
    int maxProductPath(vector<vector<int>>& grid) {
        int n=grid.size();
        int m=grid[0].size();
        const long long LIMIT=1e18;
        const int MOD=1e9+7;

        vector<vector<long long>> mn(n, vector<long long>(m));
        vector<vector<long long>> mx(n, vector<long long>(m));

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {

                if(i==0 && j==0) {
                    mn[i][j]=mx[i][j]=grid[i][j];
                }
                else if(i==0) {
                    long long a=mn[i][j-1]*grid[i][j];
                    long long b=mx[i][j-1]*grid[i][j];

                    a=max(min(a,LIMIT), -LIMIT);
                    b=max(min(b,LIMIT), -LIMIT);
                    mn[i][j]=min(a, b);
                    mx[i][j]=max(a, b);
                }
                else if(j==0) {
                    long long a=mn[i-1][j]*grid[i][j];
                    long long b=mx[i-1][j]*grid[i][j];

                    a = max(min(a,LIMIT), -LIMIT);
                    b = max(min(b,LIMIT), -LIMIT);
                    mn[i][j]=min(a,b);
                    mx[i][j]=max(a,b);
                }
                else {
                    long long a = mn[i-1][j]*grid[i][j];
                    long long b = mx[i-1][j]*grid[i][j];
                    long long c = mn[i][j-1]*grid[i][j];
                    long long d = mx[i][j-1]*grid[i][j];

                    a = max(min(a,LIMIT), -LIMIT);
                    b = max(min(b,LIMIT), -LIMIT);
                    c = max(min(c,LIMIT), -LIMIT);
                    d = max(min(d,LIMIT), -LIMIT);
                    mn[i][j] = min({a,b,c,d});
                    mx[i][j] = max({a,b,c,d});
                }
            }
        }

        if(mx[n-1][m-1] < 0) return -1;
        return mx[n-1][m-1] % MOD;
    }
};