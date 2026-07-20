class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        k%=(n*m);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans.add(grid[i][j]);
            }
        }
        int size=ans.size()-k;
        List<Integer> temp=new ArrayList<>();
        while(k-->0){
            temp.add(ans.get(size));
            ans.remove(size);
        }
        for(int ele:ans){
            temp.add(ele);
        }
        List<List<Integer>> res=new ArrayList<>();
        int l=0;
        for(int i=0;i<n;i++){
            List<Integer> p=new ArrayList<>();
            for(int j=0;j<m;j++){
                p.add(temp.get(l));
                l++;
            }
            res.add(p);
        }
        return res;
    }
}