class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            ans.add(new ArrayList<>());
        }
        for(int ele[]:prerequisites){
            ans.get(ele[1]).add(ele[0]);
        }

        boolean isVisited[]=new boolean[numCourses];
        boolean path[]=new boolean[numCourses];

        for(int i=0;i<numCourses;i++){
            if(!isVisited[i]){
                if(dfs(i,ans,isVisited,path))return false;
            }
        }
        return true;
    }

    public boolean dfs(int ind,ArrayList<ArrayList<Integer>> ans,boolean isVisited[],boolean path[]){
        isVisited[ind]=true;
        path[ind]=true;

        for(int adj:ans.get(ind)){
            if(!isVisited[adj]){
                if(dfs(adj,ans,isVisited,path))return true;
            }
            else if(path[adj]){
                return true;
            }
        }

        path[ind]=false;
        return false;
    }
}