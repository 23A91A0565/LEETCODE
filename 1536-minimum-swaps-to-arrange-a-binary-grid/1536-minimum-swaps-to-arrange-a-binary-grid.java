class Solution {
    public int minSwaps(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int row[]=new int[n];
        for(int i=0;i<n;i++){
            int c=-1;
            for(int j=m-1;j>=0;j--){
                if(grid[i][j]==1){
                    c=j;
                    break;
                }
            }
            if(c==-1)row[i]=m;
            else row[i]=m-c-1;
        }

        int res=0;
        for(int i=0;i<n;i++){
            int req=n-1-i;
            int j=i;
            while(j<n && row[j]<req){
                j++;
            }

            if(j==n)return -1;

            while(j>i){
                int temp=row[j];
                row[j]=row[j-1];
                row[j-1]=temp;
                res+=1;
                j--;
            }
        }
        return res;  
    }
    // public boolean isOk(int row[]){
    //     for(int i=0;i<row.length;i++){
    //         if(row[i]<row.length-i-1){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}