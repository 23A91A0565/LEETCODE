class Solution {
    public int maxBuilding(int n, int[][] restrictions) {
        List<int[]> l=new ArrayList<>(Arrays.asList(restrictions));
        l.add(new int[]{1,0});
        l.add(new int[]{n,n-1});
        l.sort((a,b)->Integer.compare(a[0],b[0]));
        int m=l.size();
        for(int i=1;i<m;i++){
            int dist=l.get(i)[0]-l.get(i-1)[0];
            l.get(i)[1]=Math.min(l.get(i)[1],l.get(i-1)[1]+dist);
        }

        for(int i=m-2;i>=0;i--){
            int dist=l.get(i+1)[0]-l.get(i)[0];
            l.get(i)[1]=Math.min(l.get(i)[1],l.get(i+1)[1]+dist);
        }

        int ans=0;
        for(int i=1;i<m;i++){
            int x1=l.get(i)[0];
            int h1=l.get(i)[1];

            int x2=l.get(i-1)[0];
            int h2=l.get(i-1)[1];

            int dist=x1-x2;
            ans=Math.max(ans,(h1+h2+dist)/2);
        }
        return ans;
    }
}