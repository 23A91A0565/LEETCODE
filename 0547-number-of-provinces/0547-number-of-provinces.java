class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> ans = new ArrayList<>();
        int n=isConnected.length;
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    ans.get(i).add(j);
                    ans.get(j).add(i);
                }
            }
        }
        boolean isVisited[]=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(!isVisited[i]){
                isVisited[i]=true;
                count++;
                dfs(i,ans,isVisited);
            }
        }
        return count;
    }
    public void dfs(int node,List<List<Integer>> ans,boolean isVisited[]){
        isVisited[node]=true;
        for(int ele:ans.get(node)){
            if(!isVisited[ele]){
                dfs(ele,ans,isVisited);
            }
        }
    }
}