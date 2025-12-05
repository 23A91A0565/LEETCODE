class Solution {
    // For moving in all directions
    int dir[][]={{-1,0},{1,0},{0,1},{0,-1}};
    
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans=new ArrayList<>();
        if(heights==null || heights.length==0 || heights[0].length==0){
            return ans;
        }
        int n=heights.length;
        int m=heights[0].length;
        boolean pacific[][]=new boolean[n][m];
        boolean atlantic[][]=new boolean[n][m];

        // DFS
        for(int i=0;i<m;i++){
            dfs(heights,0,i,Integer.MIN_VALUE,pacific);
            dfs(heights,n-1,i,Integer.MIN_VALUE,atlantic);
        }
        for(int i=0;i<n;i++){
            dfs(heights,i,0,Integer.MIN_VALUE,pacific);
            dfs(heights,i,m-1,Integer.MIN_VALUE,atlantic);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    ans.add(Arrays.asList(i,j));
                }
            }
        }
        return ans;
    }
    public void dfs(int heights[][],int row,int col,int prev,boolean ocean[][]){
        if(row<0 || row>=ocean.length || col<0 || col>=ocean[0].length)return;
        if(heights[row][col]< prev || ocean[row][col])return;
        ocean[row][col]=true;
        for(int ele[]:dir){
            dfs(heights,row+ele[0],col+ele[1],heights[row][col],ocean);
        }
    }
}