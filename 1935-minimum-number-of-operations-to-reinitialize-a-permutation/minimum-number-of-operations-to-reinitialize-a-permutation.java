class Solution{
    public int reinitializePermutation(int n){
        int[] curr=new int[n];
        for(int i=0;i<n;i++)curr[i]=i;
        int steps=0;

        while(true){
            int[] next=new int[n];
            for(int i=0;i<n;i++){
                if(i%2==0)next[i]=curr[i/2];
                else next[i]=curr[n/2+(i-1)/2];
            }
            steps++;

            boolean ok=true;
            for(int i=0;i<n;i++){
                if(next[i]!=i){
                    ok=false;
                    break;
                }
            }
            if(ok)return steps;
            curr=next;
        }
    }
}
