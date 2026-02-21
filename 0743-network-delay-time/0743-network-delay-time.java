class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> ans=new ArrayList<>();
        for(int i=0;i<=n;i++){
            ans.add(new ArrayList<>());
        }

        for(int ele[]:times){
            int u=ele[0];
            int v=ele[1];
            int w=ele[2];
            ans.get(u).add(new int[]{v,w});
        }

        int dist[]=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);

        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->(a[1]-b[1]));
        q.offer(new int[]{k,0});
        dist[k]=0;

        while(!q.isEmpty()){
            int a[]=q.poll();
            int ind=a[0];
            int dis=a[1];

            for(int ele[]:ans.get(ind)){
                int v=ele[0];
                int wt=ele[1];
                if(wt+dis<dist[v]){
                    dist[v]=wt+dis;
                    q.offer(new int[]{v,dist[v]});
                }
            }
        }

        int res=0;
        for(int i=1;i<=n;i++){
            if(dist[i]==Integer.MAX_VALUE)return -1;
            res=Math.max(res,dist[i]);
        }
        return res;
    }
}