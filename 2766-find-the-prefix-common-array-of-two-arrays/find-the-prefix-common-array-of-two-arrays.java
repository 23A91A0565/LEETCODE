class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        boolean[] seenA = new boolean[n + 1];
        boolean[] seenB = new boolean[n + 1];
        int[] C = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            seenA[A[i]] = true;
            seenB[B[i]] = true;
            if (seenB[A[i]]) count++;
            if (seenA[B[i]] && A[i] != B[i]) count++;
            C[i] = count;
        }
        return C;
        

        //  [OR]
        /* 
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
        */
    }
}