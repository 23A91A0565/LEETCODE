class Solution {
    public boolean canReach(int[] arr, int start) {
        int n=arr.length;
        Queue<Integer> q=new LinkedList<>();
        q.offer(start);
        boolean vis[]=new boolean[n];
        vis[start]=true;
        while(!q.isEmpty()){
            int i=q.poll();
            if(arr[i]==0){
                return true;
            }
            int left=i-arr[i];
            int right=i+arr[i];
            if(left>=0 && left<n && !vis[left]){
                vis[left]=true;
                q.offer(left);
            }
            if(right>=0 && right<n && !vis[right]){
                vis[right]=true;
                q.offer(right);
            }
        }
        return false;
    }
}