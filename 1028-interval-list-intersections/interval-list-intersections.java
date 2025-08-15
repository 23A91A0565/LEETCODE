class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int n=firstList.length;
        int m=secondList.length;
        int i=0,j=0;
        ArrayList<int[]> ans=new ArrayList<>();
        while(i<n && j<m)
        {
            int end=Math.min(firstList[i][1],secondList[j][1]);
            int start=Math.max(firstList[i][0],secondList[j][0]);
            if(start<=end)ans.add(new int[]{start,end});
            if(firstList[i][1]<secondList[j][1]){
                i++;
            }
            else{
                j++;
            }
        }
       return ans.toArray(new int[ans.size()][]);
    }
}