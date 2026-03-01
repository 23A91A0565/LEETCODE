class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> ans=new ArrayList<>();
        int inc[]=new int[n];
        for(List<Integer> a:edges){
            int u=a.get(0);
            int v=a.get(1);
            inc[v]+=1;
        }

        for(int i=0;i<n;i++){
            if(inc[i]==0){
                ans.add(i);
            }
        }
        return ans;
    }
}