class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int parent[]=new int[n];
        int k=0;
        parent[0]=k;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]<=maxDiff){
                parent[i]=k;
            }
            else{
                k+=1;
                parent[i]=k;
            }
        }
        boolean res[]=new boolean[queries.length];
        int i=0;
        for(int q[]:queries){
            int l=q[0];
            int r=q[1];
            if(parent[l]==parent[r]){
                res[i++]=true;
            }
            else{
                res[i++]=false;
            }
        }
        return res;
    }
}