class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->(a[0]-b[0]));
        int dir[][]={{-1,0},{1,0},{0,1},{0,-1}};
        q.offer(new int[]{0,0,0});

        int diff[][]=new int[n][m];
        for(int row[]:diff){
            Arrays.fill(row,Integer.MAX_VALUE);
        }

        while(!q.isEmpty()){
            int a[]=q.poll();
            int d=a[0];
            int i=a[1];
            int j=a[2];

            if(i==n-1 && j==m-1){
                return d;
            }

            for(int k=0;k<4;k++){
                int x=dir[k][0]+i;
                int y=dir[k][1]+j;

                if(x>=0 && x<n && y>=0 && y<m){
                    int newdiff=Math.max(Math.abs(heights[i][j]-heights[x][y]),d);
                    if(newdiff<diff[x][y]){
                        diff[x][y]=newdiff;
                        q.offer(new int[]{newdiff,x,y});
                    }
                }
            }
        }
        return 0;
    }
}