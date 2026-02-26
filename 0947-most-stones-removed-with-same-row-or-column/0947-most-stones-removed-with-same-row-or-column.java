class Solution {
    public int find(int parent[],int x){
        if(parent[x]!=x)
            parent[x]=find(parent,parent[x]);
        return parent[x];
    }
    public void union(int parent[],int rank[],int x,int y){
        int px=find(parent,x);
        int py=find(parent,y);
        if(px==py)return;
        if(rank[px]>rank[py])parent[py]=px;
        else if(rank[py]>rank[px])parent[px]=py;
        else{
            parent[py]=px;
            rank[px]++;
        }
    }
    public int removeStones(int[][] stones) {
        int n=stones.length;
        int parent[]=new int[n];
        int rank[]=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(stones[i][0]==stones[j][0] || stones[i][1]==stones[j][1]){
                    union(parent,rank,i,j);
                }
            }
        }
        
        HashSet<Integer> ans=new HashSet<>();
        for(int i=0;i<n;i++){
            ans.add(find(parent,i));
        }

        return n-ans.size();
    }
}