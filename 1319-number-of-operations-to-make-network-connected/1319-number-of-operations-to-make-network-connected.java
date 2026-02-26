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
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1)return -1;

        HashSet<Integer> ans=new HashSet<>();
        int parent[]=new int[n];
        int rank[]=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        for(int ele[]:connections){
            int u=ele[0];
            int v=ele[1];
            union(parent,rank,u,v);
        }

        for(int i=0;i<n;i++){
            ans.add(find(parent,i));
        }

        return ans.size()-1;
    }
}