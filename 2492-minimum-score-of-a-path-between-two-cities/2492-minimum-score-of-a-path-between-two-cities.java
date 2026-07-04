class Solution {
    public int minScore(int n, int[][] roads) {
        ArrayList<ArrayList<int[]>> ans=new ArrayList<>();
        for(int i=0;i<=n;i++){
            ans.add(new ArrayList<>());
        }
        for(int cur[]:roads){
            int a=cur[0];
            int b=cur[1];
            int dis=cur[2];
            ans.get(a).add(new int[]{b,dis});
            ans.get(b).add(new int[]{a,dis});
        }
        int res=Integer.MAX_VALUE;
        boolean vis[]=new boolean[n+1];
        Queue<Integer> q=new LinkedList<>();
        vis[1]=true;
        q.offer(1);
        while(!q.isEmpty()){
            int cur=q.poll();
            for(int ele[]:ans.get(cur)){
                res=Math.min(res,ele[1]);
                if(!vis[ele[0]]){
                    vis[ele[0]]=true;
                    q.offer(ele[0]);
                }
            }
        }
        return res;
    }
}