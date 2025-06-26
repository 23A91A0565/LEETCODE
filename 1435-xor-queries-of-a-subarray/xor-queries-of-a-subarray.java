class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=arr.length;
        int pre[]=new int[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            pre[i]=pre[i-1]^arr[i];
        }
        int res[]=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int first=queries[i][0];
            int second=queries[i][1];
            if(first==0)
            {
                res[i]=pre[second];
            }
            else{
                res[i]=pre[second]^pre[first-1];
            }
        }
        return res;
    }
}