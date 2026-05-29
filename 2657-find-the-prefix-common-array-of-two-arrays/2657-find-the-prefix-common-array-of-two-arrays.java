class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int res[]=new int[n];
        HashMap<Integer,Integer> ans=new HashMap<>();
        int c=0;
        for(int i=0;i<n;i++)
        {
            ans.put(A[i],ans.getOrDefault(A[i],0)+1);
            ans.put(B[i],ans.getOrDefault(B[i],0)+1);
            if(ans.get(A[i])==2)
            {
                c+=1;
            }
            if(ans.get(B[i])==2 && A[i] != B[i])
            {
                c+=1;
            }
            res[i]=c;
        }
        return res;
    }
}