class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> store=new ArrayList<>();
        store.add(0);
        dfs(ans,store,graph,0);
        return ans;
    }
    public void dfs(List<List<Integer>> ans,List<Integer> store,int [][]mat,int index){
        if(index==mat.length-1){
            ans.add(new ArrayList<>(store));
            return;
        }
        for(int ele:mat[index]){
            store.add(ele);
            dfs(ans,store,mat,ele);
            store.remove(store.size()-1);
        }
    }
}