class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<int[]> q=new LinkedList<>();
        int Icolor=image[sr][sc];
        if(Icolor==color)return image;
        q.offer(new int[]{sr,sc});
        while(!q.isEmpty()){
                int a[]=q.poll();
                int i=a[0];
                int j=a[1];
                image[i][j]=color;
                if(i>0 && image[i-1][j]==Icolor){
                    q.offer(new int[]{i-1,j});
                }
                if(i+1<image.length && image[i+1][j]==Icolor){
                    q.offer(new int[]{i+1,j});
                }
                if(j>0 && image[i][j-1]==Icolor){
                    q.offer(new int[]{i,j-1});
                }
                if(j+1<image[0].length && image[i][j+1]==Icolor){
                    q.offer(new int[]{i,j+1});
                }
        }
        return image;
    }
}