class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        int parent[]=new int[n];
        int size[]=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
        }
        for(int e[]:edges){
            union(e[0],e[1],parent,size);
        }
        HashMap<Integer,Integer> ver=new HashMap<>();
        HashMap<Integer,Integer> edg=new HashMap<>();
        for(int i=0;i<n;i++){
            int root=find(i,parent);
            ver.put(root,ver.getOrDefault(root,0)+1);
        }
        for(int e[]:edges){
            int root=find(e[0],parent);
            edg.put(root,edg.getOrDefault(root,0)+1);
        }
        int res=0;
        for(int v:ver.keySet()){
            int vertC=ver.get(v);
            int edgC=edg.getOrDefault(v,0);
            if(edgC==(vertC*(vertC-1))/2){
                res+=1;
            }
        }
        return res;
    }
    public static int find(int ele,int parent[]){
        if(parent[ele]==ele){
            return ele;
        }
        int val=parent[ele];
        return find(val,parent);
    }
    public static void union(int a,int b,int parent[],int size[]){
        int p1=find(a,parent);
        int p2=find(b,parent);
        if(p1==p2)return;
        if(size[p1]<size[p2]){
            parent[p1]=p2;
            size[p2]+=size[p1];
        }
        else{
            parent[p2]=p1;
            size[p1]+=size[p2];
        }
    }
}