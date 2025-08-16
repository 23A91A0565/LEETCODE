class Solution {
    public int[][] diagonalSort(int[][] mat) {
        HashMap<Integer,List<Integer>> ans=new HashMap<>();
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                ans.putIfAbsent(i-j,new ArrayList<>());
                ans.get(i-j).add(mat[i][j]);
            }
        }
        int res[][]=new int[mat.length][mat[0].length];
        for(int ele:ans.keySet()){
            List<Integer> l=ans.get(ele);
            Collections.sort(l);
        }
        for(int i=mat.length-1;i>=0;i--)
        {
            for(int j=mat[0].length-1;j>=0;j--){
                List<Integer> l=ans.get(i-j);
                int ele=l.get(l.size()-1);
                l.remove(l.size()-1);
                res[i][j]=ele;
            }
        }
        return res;

    }
}