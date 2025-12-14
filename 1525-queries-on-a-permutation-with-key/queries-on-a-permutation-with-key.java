class Solution {
    public int[] processQueries(int[] queries, int m) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1;i<=m;i++){
            ans.add(i);
        }
        int res[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int k=queries[i];
            int pos=ans.indexOf(k);
            res[i]=pos;
            ans.remove(pos);
            ans.add(0,k);
        }
        return res;
    }
}