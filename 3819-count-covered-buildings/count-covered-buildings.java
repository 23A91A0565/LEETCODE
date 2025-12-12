class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        int c=0;
        HashMap<Integer,TreeSet<Integer>> rows=new HashMap<>();
        HashMap<Integer,TreeSet<Integer>> cols=new HashMap<>();
        for(int b[]:buildings){
            int x=b[0];
            int y=b[1];
            rows.computeIfAbsent(x,k->new TreeSet<>()).add(y);
            cols.computeIfAbsent(y,k->new TreeSet<>()).add(x);
        }
        for(int b[]:buildings){
            int x=b[0];
            int y=b[1];
            TreeSet<Integer> rw=cols.get(y);
            TreeSet<Integer> cl=rows.get(x);
            
            Integer left=cl.lower(y);
            Integer right=cl.higher(y);
            Integer up=rw.lower(x);
            Integer down=rw.higher(x);

            if(left!=null && right!=null && up!=null && down!=null) c++;
        }
        return c;
    }
}