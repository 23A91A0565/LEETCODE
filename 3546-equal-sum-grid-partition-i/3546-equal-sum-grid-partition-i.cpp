class Solution {
public:
    bool canPartitionGrid(vector<vector<int>>& grid) {
        int n=grid.size();
        int m=grid[0].size();
        // vector<int>row(n);
        // vector<int>col(m);
        long long total=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                total+=grid[i][j];
            }
        }
        long long s=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                s+=grid[i][j];
            }
            if(s==total-s)return true;
        }

        s=0;
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                s+=grid[i][j];
            }
            if(s==total-s)return true;
        }
        return false;
    }
};