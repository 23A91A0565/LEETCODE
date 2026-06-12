class Solution {
    public int assignEdgeWeights(int[][] edges) {
        int n=edges.length+1;
        ArrayList<Integer> adj[]=new ArrayList[n+1];
        for(int i=0;i<=n;i++){
            adj[i]=new ArrayList<>();
        }
        for(int e[]:edges){
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }
        int maxDep=dfs(1,0,adj);
        return pow(2,maxDep-1);
    }
    public int dfs(int curr,int prev,ArrayList<Integer> adj[]){
        int dis=0;
        for(int ele:adj[curr]){
            if(ele!=prev){
                dis=Math.max(dis,dfs(ele,curr,adj)+1);
            }
        }
        return dis;
    }
    public int pow(int base,int exp){
        int mod=1000000007;
        long res=1;
        long b=base;
        while(exp>0){
            if(exp%2>0)res=res*b%mod;
            b=(b*b)%mod;
            exp=exp/2;
        }
        return (int)res;
    }
}