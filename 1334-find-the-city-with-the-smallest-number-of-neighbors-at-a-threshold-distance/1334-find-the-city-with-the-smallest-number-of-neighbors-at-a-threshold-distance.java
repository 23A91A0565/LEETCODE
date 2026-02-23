class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int dist[][]=new int[n][n];
        for(int ele[]:dist){
           Arrays.fill(ele,Integer.MAX_VALUE); 
        }
        for(int i=0;i<n;i++){
            dist[i][i]=0;
        }
        
        for(int ele[]:edges){
            int u=ele[0];
            int v=ele[1];
            int wt=ele[2];
            dist[u][v]=wt;
            dist[v][u]=wt;
        }

        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){

                    if(dist[i][j]==Integer.MAX_VALUE){
                        if(dist[i][k]!=Integer.MAX_VALUE && dist[k][j]!=Integer.MAX_VALUE){
                            dist[i][j]=dist[i][k]+dist[k][j];
                        }
                        
                    }
                    else{
                        if(dist[i][k]!=Integer.MAX_VALUE && dist[k][j]!=Integer.MAX_VALUE){
                           dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]); 
                        }
                        
                    }
                }
            }
        }
        int res=Integer.MAX_VALUE;
        int index=-1;

        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(dist[i][j]<=distanceThreshold ){
                    c+=1;
                }
            }
            if(c<=res){
                res=c;
                index=i;
            }
        }
        return index;
    }
}